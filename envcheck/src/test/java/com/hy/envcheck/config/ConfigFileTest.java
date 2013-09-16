package com.hy.envcheck.config;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

import com.hy.envcheck.config.AbstractConfig;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ConfigFileTest extends TestCase {

	public ConfigFileTest(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(ConfigFileTest.class);
	}

	public void testConfigFileType() {

		PropertyConfigurator
				.configure("/Users/xuwei/Project/HYCommons/envcheck/src/main/resources/log4j.properties");
		BasicConfigurator.configure();
		String fileNameXml = "xxx.xml";
		String fileNameExcel = "xxx.xls";
		String fileNameNull = null;
		String fileNameNotType = "xxx.xxx";
		ConfigInfo infoxml = new ConfigInfo(fileNameXml);
		assertEquals(CONFIGTYPE.XML, infoxml.getType());

		ConfigInfo infoexcel = new ConfigInfo(fileNameExcel);
		assertEquals(CONFIGTYPE.EXCEL, infoexcel.getType());

		ConfigInfo infonull = new ConfigInfo(fileNameNull);
		assertEquals(null, infonull.getType());

		ConfigInfo infonotype = new ConfigInfo(fileNameNotType);
		assertEquals(null, infonotype.getType());
	}

	public void testConfigFileLoad() {

		PropertyConfigurator
				.configure("/Users/xuwei/Project/HYCommons/envcheck/src/main/resources/log4j.properties");
		BasicConfigurator.configure();
		String fileNameXml = "xxx.xml";
		String fileNameExcel = "xxx.xls";
		ConfigInfo infoxml = new ConfigInfo(fileNameXml);
		AbstractConfig configxml = ConfigFactory.create(infoxml);
		
		assertFalse(configxml.read());
		assertFalse(configxml.isComplete());

		ConfigInfo infoexcel = new ConfigInfo(fileNameExcel);
		AbstractConfig configexcel = ConfigFactory.create(infoexcel);
		
		assertFalse(configexcel.read());
		assertFalse(configexcel.isComplete());
	}
}

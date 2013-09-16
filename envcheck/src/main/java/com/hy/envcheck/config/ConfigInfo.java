package com.hy.envcheck.config;

import java.util.Hashtable;

public class ConfigInfo {

	private String fileName;
	private CONFIGTYPE type;
	private Hashtable<String, String> config = new Hashtable<String, String>();

	public void SetPropertyExpected(String property, String expected) {
		config.put(property, expected);
	}

	public Hashtable<String, String> getConfig() {
		return config;
	}

	public ConfigInfo(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return this.fileName;
	}

	private void checkFileType() {
		if (fileName.contains("xml")) {
			type = CONFIGTYPE.XML;
			return;
		}
		if (fileName.contains("xls") || fileName.contains("xlsx")) {
			type = CONFIGTYPE.EXCEL;
			return;
		}
	}

	public CONFIGTYPE getType() {
		if (fileName != null && type == null)
			this.checkFileType();
		return type;
	}

}

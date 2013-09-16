package com.hy.envcheck.config;

import com.hy.envcheck.config.type.ConfigExcel;
import com.hy.envcheck.config.type.ConfigXML;

public class ConfigFactory {

	public static AbstractConfig create(ConfigInfo info) {
		if(info.getType() == CONFIGTYPE.XML)
		{
			return new ConfigXML(info);
		}
		if(info.getType() == CONFIGTYPE.EXCEL)
		{
			return new ConfigExcel(info);
		}
		return null;
	}

}

package com.hy.envcheck.config.type;

import org.dom4j.io.SAXReader;

import com.hy.envcheck.config.AbstractConfig;
import com.hy.envcheck.config.ConfigInfo;

public class ConfigXML extends AbstractConfig {

	public ConfigXML(ConfigInfo info) {
		this.info = info;
		this.setComplete(this.read());
	}

	@Override
	protected boolean read() {
		
		return false;
	}

}

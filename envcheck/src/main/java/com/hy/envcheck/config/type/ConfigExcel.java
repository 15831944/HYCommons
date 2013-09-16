package com.hy.envcheck.config.type;

import com.hy.envcheck.config.AbstractConfig;
import com.hy.envcheck.config.ConfigInfo;

public class ConfigExcel extends AbstractConfig {

	public ConfigExcel(ConfigInfo info) {
		this.info = info;
	}

	@Override
	protected boolean read() {
		
		return false;
	}

}

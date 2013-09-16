package com.hy.envcheck.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractConfig {

	private static Log logger = LogFactory.getLog(AbstractConfig.class);

	protected boolean status = false;

	protected ConfigInfo info = null;

	public boolean isComplete() {
		return status;
	}

	public AbstractConfig() {
		this.read();
	}

	protected abstract boolean read();

}

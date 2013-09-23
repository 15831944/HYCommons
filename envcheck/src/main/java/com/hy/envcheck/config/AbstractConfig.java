package com.hy.envcheck.config;

import com.envcheck.Error;
import com.hy.envcheck.config.error.ConfigError;

public abstract class AbstractConfig {

	protected boolean status = false;

	protected ConfigInfo info = null;
	
	private Error error = new ConfigError();
	
	public boolean isComplete() {
		return status;
	}
	
	protected void setComplete(boolean status) {
		this.status = status;
	}
	
	public ConfigInfo getInfo()
	{
		return info;
	}
	
	public void setInfo(ConfigInfo info)
	{
		this.info = info;
	}
	
	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	protected abstract boolean read();

}

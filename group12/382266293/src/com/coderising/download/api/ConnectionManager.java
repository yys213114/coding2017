package com.coderising.download.api;

public interface ConnectionManager {
	/**
	 * 给定一个url , 打开一个连接
	 * @param url
	 * @return
	 */
	
	final int MAX_CONNECTION_SIZE = 100;
	
	public Connection open(String url) throws ConnectionException;
}
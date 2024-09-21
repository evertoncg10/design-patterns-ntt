package com.nttdata.creational.singleton.connectionPool.after.conn;

public class Connection {
private boolean inUse;
	
	public Connection() {
		inUse = false;
	}
	
	public Object query(String sql) {
		System.out.println("Rodando '" + sql + "' em conexão " + this);
		return null;
	}
	
	boolean isInUse() {
		return inUse;
	}
	
	void setInUse(boolean status) {
		inUse = status;
	}
}

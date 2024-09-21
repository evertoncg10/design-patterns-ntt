package com.nttdata.creational.singleton.connectionPool.after;

import com.nttdata.creational.singleton.connectionPool.after.conn.Connection;
import com.nttdata.creational.singleton.connectionPool.after.conn.ConnectionPool;

public class Main {
    public static void doQuery1() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A1");
    }

    public static void doQuery2() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A2");
    }

    public static void doQuery3() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A3");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Tamanho do pool de conexões: " + ConnectionPool.POOL_SIZE);
        int pool = ConnectionPool.POOL_SIZE;
        System.out.println(pool);
        doQuery1();
        doQuery2();
        doQuery3();
    }
}

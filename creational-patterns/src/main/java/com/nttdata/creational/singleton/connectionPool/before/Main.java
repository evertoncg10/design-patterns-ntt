package com.nttdata.creational.singleton.connectionPool.before;

import com.nttdata.creational.singleton.connectionPool.before.conn.Connection;
import com.nttdata.creational.singleton.connectionPool.before.conn.ConnectionPool;

public class Main {
    public static void doQuery1() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A1");
    }

    public static void doQuery2() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A2");
    }

    public static void doQuery3() {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A3");
    }

    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        doQuery3();

        //3 conexões foram feitas, mesmo com limite de 2 conexões
    }
}

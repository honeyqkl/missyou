package com.qiusannu.missyou.sample.database;

import com.qiusannu.missyou.sample.IConnect;


public class MySQL implements IConnect {

    private String ip = "localhost";

    private Integer port = 3306;

    public MySQL(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void connect() {
        System.out.println(this.ip + "   " + this.port);
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}

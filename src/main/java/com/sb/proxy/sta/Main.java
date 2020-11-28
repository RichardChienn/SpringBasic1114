package com.sb.proxy.sta;

public class Main {
    public static void main(String[] args) {
        Job job = new RealJob();
        Job proxyJob = new ProxyJob(new RealJob());
        proxyJob.work();
    }
}

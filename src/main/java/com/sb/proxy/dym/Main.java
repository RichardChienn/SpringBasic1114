package com.sb.proxy.dym;



public class Main {
    public static void main(String[] args) {
        ProxyUtil proxyUtil = new ProxyUtil(new CalcImpl());
        Calc calc  = (Calc)proxyUtil.getProxy();
        System.out.println(calc);
        System.out.println(calc.div(10, 0      ));
        
    }
}

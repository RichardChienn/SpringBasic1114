package com.sb.proxy.dym;

import com.sb.aop.CalcImpl;
import com.sb.aop.Calc;



public class Main {
    public static void main(String[] args) {
        ProxyUtil proxyUtil = new ProxyUtil(new CalcImpl());
        Calc calc  = (Calc)proxyUtil.getProxy();
        System.out.println(calc);
        System.out.println(calc.div(10, 0      ));
        
    }
}

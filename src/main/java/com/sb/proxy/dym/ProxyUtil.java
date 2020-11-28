package com.sb.proxy.dym;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {

    private Object object;

    public ProxyUtil(Object object) {
        this.object = object;
    }

    public Object getProxy() {
        //獲取單前類別的類加載器，用來加載代理對象所屬的類別
        ClassLoader loader = getClass().getClassLoader();
        //獲取當前目標對象所有介面的class，目的是給代理物件來實現它的功能
        Class[] interfaces = object.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                //前置通知
                System.out.println("準備好紙筆來計算......");
                System.out.println("參數 : " + (args != null ? Arrays.toString(args) : ""));
                result = method.invoke(object, args);
                return result;
            }
        };
        return Proxy.newProxyInstance(loader, interfaces, h);
    }

}

package com.jpa.manytoone;

import com.jpa.JPATemplate;
import com.jpa.entity.manytoone.Orders;
import org.junit.Test;

public class Delete extends JPATemplate{
    @Test
    public void t1(){
        //透過永續物件刪除
        Orders o1 = (Orders)session.get(Orders.class, 1);
        session.delete(o1);
        
        System.out.println("完成");
    }
}

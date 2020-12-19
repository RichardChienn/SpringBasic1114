package com.jpa.manytoone;

import com.jpa.JPATemplate;
import com.jpa.entity.manytoone.Customer;
import com.jpa.entity.manytoone.Orders;
import org.junit.Test;

public class Update extends JPATemplate {
    @Test
    public void t1() {
        // id = 5 改成 cookie
        Orders o1 = (Orders)session.get(Orders.class, 5);
        
        o1.setName("Cookie");
     
        
        // 執行保存動作  
        //因為 o1 已經是永續物件 ， 所以不用再下達 update 指令
        //session.persist(o1);
      
        System.out.println("完成");
        
    }
}

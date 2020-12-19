package com.jpa.manytoone;

import com.jpa.JPATemplate;
import com.jpa.entity.manytoone.Customer;
import com.jpa.entity.manytoone.Orders;
import org.junit.Test;

public class Update2 extends JPATemplate {
    @Test
    public void t1() {
        Customer c1 =(Customer)session.get(Customer.class, 7);
        //游離物件的 update
        // id = 5 改成 cookie
        Orders o1 =new Orders();
        o1.setId(5);
        o1.setName("Bread");
        //配置與 Customer 的關係
        o1.setCustomer(c1);
                
        // 執行保存動作  
        //因為 o1 是游離物件 ， 所以需要下達 update 指令
        session.update(o1);
      
        System.out.println("完成");
        
    }
}

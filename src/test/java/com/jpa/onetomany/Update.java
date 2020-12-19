package com.jpa.onetomany;

import com.jpa.JPATemplate;
import com.jpa.entity.onetomany.Bookshelf;
import org.junit.Test;

public class Update extends JPATemplate{
    //從書櫃去改變某一本書的價格
    @Test
    public void t1(){
        Bookshelf bookshelf =(Bookshelf)session.get(Bookshelf.class,1);
        //原本價格再增加10%
        bookshelf.getBooks().stream().forEach(book ->{
        int price =(int)(book.getPrice()* 1.1);
        book.setPrice(price);
        });
        
        System.out.println("完成");
    }
}

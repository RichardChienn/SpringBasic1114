package com.jpa.manytomany;

import com.jpa.JPATemplate;
import com.jpa.entity.manytomany.Fund;
import com.jpa.entity.manytomany.Stock;
import java.util.List;
import org.junit.Test;

public class Update extends JPATemplate{
    //移除成分股
    @Test
    public void t1(){
        Stock stock =(Stock) session.get(Stock.class, 2);
        List<Fund> funds = session.createQuery("From Fund f").list();
        funds.forEach(fund -> fund.getStocks().remove(stock));
        
        
    }
}

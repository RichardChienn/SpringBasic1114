package com.jdbc.template.tx.exception;

// 錢包裡的錢不足例外
public class InsufficientBookStock extends Throwable {

    public InsufficientBookStock() {
        System.out.println("Book的庫存不足");
    }
    
}
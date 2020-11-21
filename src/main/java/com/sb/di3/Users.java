
package com.sb.di3;

//資料源

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //相當於  <bean id = "users" .....
@Scope(value = "singleton")
public class Users {
    
}

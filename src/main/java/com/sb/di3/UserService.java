package com.sb.di3;

import java.util.List;
import java.util.Optional;
import static java.util.stream.Collectors.toList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "singleton")
public class UserService {

    @Autowired
    private UserDao userdao;

    public List<String> findAllUser() {
        return userdao.queryuUsers()
                .stream()
                .filter(name -> name.charAt(0) != 'M')
                .collect(toList());
    }
  

    public String findUserByName(String name) {
        List<String> users = userdao.queryuUsers();
        Optional<String> nameOpt = users.stream()
                .filter(n -> n.charAt(0) != 'M')
                .filter(n -> n.equals(name))
                .findAny();
        return nameOpt.isPresent() ? nameOpt.get() : "查無此人";
    }
    
   

}

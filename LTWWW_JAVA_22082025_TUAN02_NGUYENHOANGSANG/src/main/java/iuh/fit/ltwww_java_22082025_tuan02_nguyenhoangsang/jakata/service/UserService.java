package iuh.fit.ltwww_java_22082025_tuan02_nguyenhoangsang.jakata.service;


import iuh.fit.ltwww_java_22082025_tuan02_nguyenhoangsang.jakata.User;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {
    public User getUser(){
        return new User(1,"Sang","Sang@gmail.com");
    }
}

package com.pashi.Repository;

import com.pashi.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class UserRepository {

    protected  final User user;


    public  UserRepository(User user){
        this.user =user;
    }





    public User   findById(long id){
        return user;
    }
}

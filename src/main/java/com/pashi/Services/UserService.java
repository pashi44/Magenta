package com.pashi.Services;

import com.pashi.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
    private   final UserRepository userRepo;


    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo; //DI

    }

    public User getUserById(Long id)
    {
        return  null;
    }

}

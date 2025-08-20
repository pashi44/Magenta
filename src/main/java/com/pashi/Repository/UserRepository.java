package com.pashi.Repository;

import com.pashi.Models.User;

public interface UserRepository {
    User findUserById(Long id);

}

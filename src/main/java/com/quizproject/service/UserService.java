package com.quizproject.service;


import com.quizproject.dto.UserDto;
import com.quizproject.model.User;

public interface UserService {

    User findByUsername(String username);
    User save (UserDto userDto);

}
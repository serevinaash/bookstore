package com.bookStore.service;

import com.bookStore.dto.UserDto;
import com.bookStore.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findByEmail(String email); // Deklarasi metode findByEmail
    List<UserDto> findAllUsers();
}

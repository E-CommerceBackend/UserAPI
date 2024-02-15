package com.envy.userapi.service;

import com.envy.userapi.dto.UserDto;

public interface UserService {

    UserDto registerUser(UserDto userDto);

    UserDto getUserByUsername(String username);

    UserDto getUserById(long id);

    UserDto updateUserById(long id, UserDto userDto);

    boolean deleteUserById(long id);
}

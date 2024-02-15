package com.envy.userapi.util;

import com.envy.userapi.dto.UserDto;
import com.envy.userapi.entity.User;

public class UserMapper {

    public static UserDto toDto(User user) {
        return user == null ? null : new UserDto(user.getUsername(), user.getPassword(), user.getEmail());
    }

    public static User toEntity(UserDto userDto) {
        if ( userDto == null ) return null;
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        return user;
    }

}

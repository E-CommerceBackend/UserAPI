package com.envy.userapi.controller;

import com.envy.userapi.dto.UserDto;
import com.envy.userapi.entity.User;
import com.envy.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());

        User registeredUser = userService.registerUser(user);

        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }
}

package com.envy.userapi.service;

import com.envy.userapi.dto.UserDto;
import com.envy.userapi.entity.User;
import com.envy.userapi.repository.UserRepository;
import com.envy.userapi.util.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto registerUser(UserDto userDto) {
        User user = UserMapper.toEntity(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.toDto(savedUser);
    }

    @Override
    public UserDto getUserByUsername(String username) {
        User user = userRepository.findByUsername(username).orElse(null);
        if (user != null) {
            return UserMapper.toDto(user);
        }
        return null;
    }

    @Override
    public UserDto getUserById(long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            return UserMapper.toDto(user);
        }
        return null;
    }

    @Override
    public UserDto updateUserById(long id, UserDto userDto) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            // Update user details with the new values from userDto
            existingUser.setUsername(userDto.getUsername());
            existingUser.setPassword(userDto.getPassword());
            existingUser.setEmail(userDto.getEmail());
            // Save the updated user to the repository
            User updatedUser = userRepository.save(existingUser);
            // Return the updated user DTO
            return UserMapper.toDto(updatedUser);
        }
        return null; // or throw an exception if user not found
    }

    @Override
    public boolean deleteUserById(long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }


}

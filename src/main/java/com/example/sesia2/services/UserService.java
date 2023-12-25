package com.example.sesia2.services;

//import com.example.sesia2.exceptions.UsernameExistsException;

import com.example.sesia2.dto.UserRequestDto;
import com.example.sesia2.dto.UserResponseDto;
import com.example.sesia2.exceptions.EmailExistsException;
import com.example.sesia2.exceptions.UsernameExistsException;

import java.util.UUID;

public interface UserService {
    UserResponseDto getUser(UUID id);
    UUID register(UserRequestDto userRequestDto) throws UsernameExistsException, UsernameExistsException, EmailExistsException;

    UUID addRoleToUser(UUID userId, String roleName);
}
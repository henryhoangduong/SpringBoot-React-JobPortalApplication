package com.jobportal.backend.service.impl;

import com.jobportal.backend.dto.UserDTO;
import com.jobportal.backend.entity.User;
import com.jobportal.backend.exception.JobPortalException;
import com.jobportal.backend.repository.UserRepository;
import com.jobportal.backend.service.UserService;
import com.jobportal.backend.utility.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDTO registerUser(UserDTO userDTO) throws JobPortalException {
        userDTO.setId(Utilities.getNextSequence("users"));
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        User user = userDTO.toEntity();
        user = userRepository.save(user);
        return user.toDTO();
    }
}

package com.jobportal.backend.service;

import com.jobportal.backend.dto.LoginDTO;
import com.jobportal.backend.dto.UserDTO;
import com.jobportal.backend.exception.JobPortalException;

public interface UserService {
    public UserDTO registerUser(UserDTO userDTO) throws JobPortalException;
    public UserDTO loginUser(LoginDTO loginDTO) throws JobPortalException;
}

package com.jobportal.backend.dto;

import com.jobportal.backend.entity.User;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserDTO {
    private String id;
    @NotBlank(message = "Name is not null or blank")
    private String name;
    @NotBlank(message = "Email is not null or blank")
    private String email;
    @NotBlank(message = "Password is not null or blank")
    private String password;
    private AccountType accountType;

    public UserDTO() {
    }

    public UserDTO(String id, String name, String email, String password, AccountType accountType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.accountType = accountType;
    }

    public User toEntity() {
        return new User(this.id, this.name, this.email, this.password, this.accountType);

    }

}

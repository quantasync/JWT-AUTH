package com.auth.payload.response;

import lombok.Data;

@Data
public class UserInfoResponse {
    private String username;
    private String email;

    public UserInfoResponse(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
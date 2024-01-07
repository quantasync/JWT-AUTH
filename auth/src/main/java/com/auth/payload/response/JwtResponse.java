package com.auth.payload.response;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JwtResponse {
    private String accesstoken;
    private Integer id;
    private String username;
    private String email;
    private List<String> roles;
    
    public JwtResponse(String accesstoken, Integer id, String username, String email, List<String> roles) {
        this.accesstoken = accesstoken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
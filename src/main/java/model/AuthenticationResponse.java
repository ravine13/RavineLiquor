package model;


import lombok.Data;

@Data
public class AuthenticationResponse {
    private String token;
    public AuthenticationResponse(String token) {}
    public String getToken() {
        return token;
    }
}

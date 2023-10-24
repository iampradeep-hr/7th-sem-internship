package com.pradeep.spring_security.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class JwtResponse {
    private String jwtToken;
    private String userName;
}

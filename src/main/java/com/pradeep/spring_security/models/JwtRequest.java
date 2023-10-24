package com.pradeep.spring_security.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class JwtRequest {

    private String email;
    private String password;
}

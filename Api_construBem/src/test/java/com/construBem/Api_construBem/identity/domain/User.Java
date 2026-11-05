package com.construBem.Api_construBem.identity.domain;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class User{

    private Long id;
    private String name;
    private String email;
    private String password;
    private boolean status;
}
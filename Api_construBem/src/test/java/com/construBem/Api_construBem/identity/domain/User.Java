package com.construBem.Api_construBem.identity.domain;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class User{

    private String id;
    private String name;
    private String email;
    private String password;
    private boolean status;
}
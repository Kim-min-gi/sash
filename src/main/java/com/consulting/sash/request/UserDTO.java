package com.consulting.sash.request;

import jakarta.validation.constraints.NotBlank;
import lombok.ToString;

@ToString
public class UserDTO {


    private Long id;

    @NotBlank
    private String userName;

    @NotBlank
    private String email;

    @NotBlank
    private String phon;




}

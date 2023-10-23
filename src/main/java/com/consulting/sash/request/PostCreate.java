package com.consulting.sash.request;

import lombok.ToString;

@ToString
public class PostCreate {

    private String title;
    private String content;

    private UserDTO user;


}

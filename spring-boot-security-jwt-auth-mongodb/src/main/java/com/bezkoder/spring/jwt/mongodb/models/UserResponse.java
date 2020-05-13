package com.bezkoder.spring.jwt.mongodb.models;

import lombok.Data;

@Data
public class UserResponse {

  String content;

  public UserResponse() {
  }

  public UserResponse(String content) {
    this.content = content;
  }
}

package com.wvk.demo.models;

public class Post {
  public String name;
  public String description;
  public String category;

  public Post(String description, String category, String name) {
    this.description = description;
    this.category = category;
    this.name = name;
  }

}

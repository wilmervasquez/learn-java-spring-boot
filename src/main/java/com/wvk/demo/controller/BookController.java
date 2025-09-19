package com.wvk.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BookController {
  @GetMapping("/books")
  public String books() {
    return "books";
  }
  @GetMapping("/books/{id}")
  public Map<String, Object> books2(@PathVariable int id) {
    Map<String, Object> book = new HashMap<>();
    book.put("id", id);
    book.put("description", "El principito");
    return book;
  }
}

package com.wvk.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Routes {
  private final Logger logger = LoggerFactory.getLogger(Routes.class);

  @GetMapping("/store")
  String store() {
    return "store";
  }

  @GetMapping("/store/planet")
  String storePlanet() {
    return "store";
  }
  @GetMapping("/users/{id}")
  String users(@PathVariable String id) {
    return "User " + id;
  }
  @GetMapping("/users")
  String findUsers(@RequestParam String id) {
    return "User " + id;
  }
  @PostMapping("/posts")
  String createPost(@RequestBody com.wvk.demo.models.Post post) {

    return "Name " + post.name + " " + post.description;
  }
  @PostMapping("/saludar")
  @ResponseStatus(value = HttpStatus.ACCEPTED)
  String createSaludar() {
    return "Saludar ";
  }

  @GetMapping("/posts/category/{category}")
  ResponseEntity<String> getAllPosts(@PathVariable String category) {
    if (category.equals("posts")) {
      return ResponseEntity.status(HttpStatus.OK).body("All posts x2");
    } else if (category.equals("manias")) {
      return ResponseEntity.status(HttpStatus.OK).body("All posts");
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid category");
    }
  }

  @GetMapping("/calculate/{number}")
  int getCalculate(@PathVariable int number) {
    throw new NullPointerException("Calculate not implemented");
  }

  @GetMapping("/user/v2")
  public Map<String, String> getUserV2() {
    Map<String, String> user = new HashMap<>();
    user.put("name", "Wvk");
    user.put("lastName", "Wvk");

    return user;
  }

  @GetMapping("/user/v1")
  ResponseEntity<String> getUser() {
    return ResponseEntity.status(HttpStatus.OK).header("Content-Type", "application/json").body("User");
  }

}



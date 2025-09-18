package com.wvk.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {
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
    return "User" + id;
  }
}

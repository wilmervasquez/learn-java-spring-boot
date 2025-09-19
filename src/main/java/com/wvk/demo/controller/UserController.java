package com.wvk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
  @GetMapping("/info-po")
  public String macros(Model model) {
    System.out.println(90);
    model.addAttribute("role", "admin");
    return "details";
  }
}



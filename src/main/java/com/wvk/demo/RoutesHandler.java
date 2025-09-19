package com.wvk.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class RoutesHandler {
  private final Logger logger = LoggerFactory.getLogger(RoutesHandler.class);
  @ExceptionHandler(NullPointerException.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public String handleNullPointerException(NullPointerException ex) {
    logger.error(ex.getMessage());
    return "error milove";
  }
}

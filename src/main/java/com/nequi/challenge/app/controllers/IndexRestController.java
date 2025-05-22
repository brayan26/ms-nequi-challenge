package com.nequi.challenge.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/info")
public class IndexRestController {
   @Autowired
   private Environment env;

   @GetMapping(produces = {"application/json"})
   public ResponseEntity<?> index() {
      Map<String, String> body = new LinkedHashMap<>();
      body.put("ms", env.getProperty("app.name"));
      body.put("version", env.getProperty("app.version"));
      return ResponseEntity.ok(body);
   }
}

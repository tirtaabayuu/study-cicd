package com.projectbackend.backendcicd.controller;

import com.projectbackend.backendcicd.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/api/response")
public class RestApiController {
    @GetMapping
    public Message getResponse() {
        return new Message("Hello from GET Method.");
    }
    @PutMapping
    public Message putResponse() {
        return new Message("Hello from PUT Method.");
    }
    @PostMapping
    public Message postResponse() {
        return  new Message ("Hello from POST Method.");
    }
    @DeleteMapping
    public Message deleteResponse() {
        return new Message("Hello from DELETE Method.");
    }
}

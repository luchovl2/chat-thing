package com.luciano.chatthing.controllers;

import com.luciano.chatthing.entities.User;
import com.luciano.chatthing.services.ChatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/v1/chatthing")
public class ChatController
{
    private final ChatService service;

    public ChatController(ChatService service)
    {
        this.service = service;
    }

    @GetMapping({"", "/"})
    public String home()
    {
        return "index";
    }

    @GetMapping("/chat")
    public String chat()
    {
        return "chat";
    }

    @GetMapping("/users")
    @ResponseBody
    public Map<Integer, User> users()
    {
        return service.getUsers();
    }

    @GetMapping("/user/{userId}")
    @ResponseBody
    public User user(@PathVariable(name = "userId") int userId)
    {
        return service.getUsers().get(userId);
    }

    @GetMapping("/contacts/{userId}")
    @ResponseBody
    public Set<Integer> contacts(@PathVariable(name = "userId") int userId)
    {
        return service.getContacts(userId);
    }



    @RequestMapping("/error")
    public String error()
    {
        return "error";
    }
}

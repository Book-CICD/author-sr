package com.example.Author_info.controller;

import com.example.Author_info.Client.FullResponse;
import com.example.Author_info.model.Author;
import com.example.Author_info.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService autherService;

    @PostMapping("/add")
    public Author addAuther(@RequestBody Author author){
        return autherService.addAuther(author);
    }
    @GetMapping("/get/{authorId}")
    public Author getAuther(@PathVariable String authorId){
        return autherService.getAuther(authorId);
    }
    @GetMapping("/getBooks/{authorId}")
    public FullResponse getBooks(@PathVariable String authorId){
            return autherService.getBooks(authorId);
}
    }


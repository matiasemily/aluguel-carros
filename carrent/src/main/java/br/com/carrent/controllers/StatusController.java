package br.com.carrent.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("status")
public class StatusController {

    @GetMapping
    public String statusGet(){
        return "Server is on line!";
    }

    @PostMapping
    public String statusPost(@RequestBody String nome){
        return nome;
    }

}

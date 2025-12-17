package com.example.demo.Controller;
import org.springframework.web.bimd.annotation.*;
@RestController
public class basics{
    @GetMappping("/home")
    public String name(){
        return "hello world"
    }
}

package ru.itpark.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itpark.webservice.entity.User;
import ru.itpark.webservice.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getAll() {
        return userService.findAll();

    }

    @GetMapping(path = "/search",params ="name")
    public List<User> searchByName(@RequestParam String name) {
        return userService.searchByName(name);

    }

    @PostMapping
    public void add(@RequestBody User user){
        userService.add(user);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);
    }


}

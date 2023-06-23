package fr.ouadi.myApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.ouadi.myApi.model.User;
import fr.ouadi.myApi.service.UserService;

@RestController
public class UserController {
    private UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/user")
    public User getUser(@RequestParam int id) {
       User user = userService.getUsers(id);
       return user;
    }

   @PostMapping("/user")
   public User createUser(@RequestBody UserRequest userRequest){
    String name = userRequest.getName();
    int age = userRequest.getAge();
    return userService.createUser(name, age);
   }

   /*@PutMapping("/user")
   public User updateUser(@RequestParam int id, @RequestBody UserRequest userRequest){
    String name = userRequest.getName();
    int age = userRequest.getAge();
    return userService.updateUser(id, null, id);
   }
*/

}


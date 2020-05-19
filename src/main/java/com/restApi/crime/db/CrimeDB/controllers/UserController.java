//package com.restApi.crime.db.CrimeDB.controllers;
//
//import com.restApi.crime.db.CrimeDB.domain.User;
//import com.restApi.crime.db.CrimeDB.service.UserService;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
////@RestController
////@RequestMapping(UserController.BASE_URL)
//public class UserController {
//    private final UserService mUserService;
//    final static String BASE_URL="/user";
//
//    public UserController(UserService userService) {
//        mUserService = userService;
//    }
//
//    @GetMapping("/all")
//    public List<User> getAllUser(){
//        return mUserService.getAllUserList();
//    }
//
//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Long id){
//        if (id == null) return null;
//        return mUserService.findUserById(id);
//    }
//
//    @PostMapping("create/")
//    @ResponseStatus(HttpStatus.CREATED)
//    public boolean saveUser(@RequestBody User user){
//        return mUserService.saveUserCredentials(user);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public boolean deleteUser(@PathVariable Long id){
//        return mUserService.deleteUserCredentials(id);
//    }
//
//    @PutMapping("/update/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public User updateUserCredentials(@PathVariable Long id ,
//                                      @RequestBody User user){
//        //will return edited user object but with new id , fetch id from the object to
//        // use it
//        return mUserService.updateUserCredentials(id,user);
//    }
//}

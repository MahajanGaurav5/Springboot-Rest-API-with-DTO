package com.demo.controller;

import com.demo.dto.UserDto;
import com.demo.entities.User;
import com.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{

    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public String saveRegData(@RequestBody UserDto userDTO)
    {
        User u1=userService.saveUserData(userDTO);

        String msg=null;

        if(u1!=null)
            msg="Your Data Saved Successfully..";
        else
            msg="Please check Password and Confirm Password must have same";

        return msg;

    }



//    @GetMapping("/get/{uid}")
//    public User getUserData(@PathVariable Integer uid)
//    {
//        User u2=userService.getUserData(uid);
//
//        return u2;
//
//    }
//
//    @GetMapping("/getall")
//    public List<User> getAllUsersData()
//    {
//        List<User> us= userService.getAllUsers();
//
//        return us;
//    }
//
//    @PutMapping("/update/{stdId}")
//    public User updateUser(@RequestBody UserDto userDTO, @PathVariable Integer uid)
//    {
//
//        return userService.updateUser(userDTO, uid);
//    }
//
//    @DeleteMapping("/delete/{uid}")
//    public void deleteUserData(@PathVariable Integer uid)
//    {
//        userService.deleteUserData(uid);
//        System.out.println("One User Reg Data Deleted Successfully..");
//
//    }
}











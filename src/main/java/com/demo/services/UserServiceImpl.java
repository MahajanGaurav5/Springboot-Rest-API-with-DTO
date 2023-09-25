package com.demo.services;

import com.demo.dto.UserDto;
import com.demo.entities.User;
import com.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUserData(UserDto userDTO)
    {
    	User us=new User();
    	private uid1=userDto.getUid();
    	private uname1=userDto.getname();
    	private about1=userDto.getAbout();
    	
    	us.
    	User u1=userRepo.save(us);
		return u1;
    }

//    @Override
//    public User getUserData(Integer uid) {
//        User u2=userRepo.findById(uid).get();
//        return u2;
//    }
//
//    @Override
//    public void deleteUserData(Integer uid)
//    {
//        userRepo.deleteById(uid);
//
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        List<User> s1=new ArrayList<User>();
//                s1=userRepo.findAll();
//        return s1 ;
//    }
//
//    @Override
//    public User updateUser(UserDto userRegData, Integer uid) {
//        // TODO Auto-generated method stub
//        return null;
//    }



}

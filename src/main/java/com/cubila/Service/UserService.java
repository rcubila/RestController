package com.cubila.Service;
import com.cubila.Entity.User;
import com.cubila.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

//    @Autowired
//    private UserDao userDao;

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUserById(int id){
        return userRepository.findOne(id);
    }

    public void removeUserById(int id){
        userRepository.delete(id);
    }

    public void updateUser(User user){


        User s = userRepository.findOne(user.getId());

        s.setName(user.getName());
        s.setLastName(user.getLastName());
        s.setAge(user.getId());
        s.setAge(user.getId());
        s.setPhoneNumber(user.getPhoneNumber());
        s.setEmail(user.getEmail());
        userRepository.save(s);
//        users.put(user.getId(), user);
    }

    public void insertUser(User user){
        userRepository.save(user);
    }

//    public Collection<User> getAllUsers(){
//        return userDao.getAllUsers();
//    }
//
//    public User getUserById(int id){
//        return this.userDao.getUserById(id);
//    }
//
//    public void removeUserById(int id) {
//
//        this.userDao.removeUserById(id);
//    }
//
//    public void updateUser(User user){
//        this.userDao.updateUser(user);
//    }
//
//    public void insertUser(User user) {
//        userDao.insertUserToDb(user);
//    }
}

package liqour.ravine.service;

import liqour.ravine.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import liqour.ravine.entities.User;


@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    //create
    public User saveUser(User user){
        return userRepository.save(user);
    }
    //get
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
    //getby id
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
    //getby name
    public User getUserByUserName(String username) {
        return userRepository.findUserByUsername(username).orElse(null);
    }
    //update
    public User updateUser(User user){
        return userRepository.save(user);
    }
    //delete
    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}

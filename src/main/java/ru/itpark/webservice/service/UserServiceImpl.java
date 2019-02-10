package ru.itpark.webservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.webservice.entity.User;
import ru.itpark.webservice.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public void add(User user){
        userRepository.save(user);

    }

    @Override
    public List<User> searchByName(String name) {
        return userRepository.findAllByNameContainsIgnoreCase(name);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

}

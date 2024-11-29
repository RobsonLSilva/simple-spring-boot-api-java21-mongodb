package br.com.robson.api_spring_mongodb.services;

import br.com.robson.api_spring_mongodb.domain.entities.User;
import br.com.robson.api_spring_mongodb.repository.UserRepository;
import br.com.robson.api_spring_mongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        return userRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}

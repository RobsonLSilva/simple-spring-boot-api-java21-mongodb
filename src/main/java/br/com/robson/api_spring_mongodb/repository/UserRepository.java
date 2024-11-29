package br.com.robson.api_spring_mongodb.repository;

import br.com.robson.api_spring_mongodb.domain.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

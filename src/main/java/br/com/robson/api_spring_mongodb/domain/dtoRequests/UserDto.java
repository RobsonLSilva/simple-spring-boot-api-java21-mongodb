package br.com.robson.api_spring_mongodb.domain.dtoRequests;

import br.com.robson.api_spring_mongodb.domain.entities.User;

import java.io.Serial;
import java.io.Serializable;

public class UserDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    public UserDto() {
    }
    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

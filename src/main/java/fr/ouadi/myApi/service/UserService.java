package fr.ouadi.myApi.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.ouadi.myApi.model.User;

@Service
public class UserService {
    private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<>();
        users.add(new User(1, "Jean", 45));
        users.add(new User(2, "Marc", 25));
        users.add(new User(3, "Pierre", 30));
    }

    public User getUsers(int id){
        for (User user : this.users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User createUser(String name, int age) {
        
        User user = new User(this.users.size() + 1, name, age);
        this.users.add(user);
        return user;
    }

    public User updateUser(int id, String name, int age){
        for (User user : this.users) {
            if(user.getId() == id){
                user.setName(name);
                user.setAge(age);
                return user;
            }
        }
        return null;
    }

        public User deleteUser(int id) {
        for (User user : this.users) {
            if (user.getId() == id) {
                int index = this.users.indexOf(user);
                return this.users.remove(index);
            }
        }

        return null;
        
    }
    
}

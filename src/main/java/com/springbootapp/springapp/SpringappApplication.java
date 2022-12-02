package com.springbootapp.springapp;

import com.springbootapp.dao.UserRepository;
import com.springbootapp.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringappApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringappApplication.class, args);

        UserRepository userRepo = context.getBean(UserRepository.class);

        User user = new User();
        user.setCity("Pune");
        user.setName("Bunny");

        User user1 = userRepo.save(user);

        System.out.println(user1);

    }

}

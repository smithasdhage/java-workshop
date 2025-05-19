package com.xworks.instagram.runner;

import com.xworks.instagram.repository.InstagramUserRepository;
import com.xworks.instagram.repository.InstagramUserRepositoryImplementation;
import com.xworks.instagram.things.InstagramUserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstagramRunner {
    public static void main(String[] args) {
        InstagramUserDetails instagramUserDetails = new InstagramUserDetails();
        instagramUserDetails.setName("Smitha S Dhage");
        instagramUserDetails.setEmail("smithadhage812@gmail.com");
        instagramUserDetails.setDateOfBirth(LocalDate.of(2006, 04, 25));
        instagramUserDetails.setCreatedOn(LocalDateTime.now());
        System.out.println(instagramUserDetails.toString());
        System.out.println("Welcome To Instagram!!!!");
        InstagramUserDetails user1 = new InstagramUserDetails();
        user1. setName("Sanketh");
        user1.setEmail("sanketh812@gmail.com");
        user1.setDateOfBirth(LocalDate.of(2007, 12, 30));
        user1.setCreatedOn(LocalDateTime.now());
        System.out.println(instagramUserDetails.toString());
        InstagramUserDetails user2 = new InstagramUserDetails();
        user2. setName("Viraj Suresh Dhage");
        user2.setEmail("viraj12@gmail.com");
        user2.setDateOfBirth(LocalDate.of(2011, 01, 07));
        user2.setCreatedOn(LocalDateTime.now());
        System.out.println(instagramUserDetails.toString());
        InstagramUserRepository repo = new InstagramUserRepositoryImplementation();
        repo.saveUserDetails(instagramUserDetails);
        repo.saveUserDetails(user1);
        repo.saveUserDetails(user2);
        repo.readInstagramUsers();
        repo.findUserDetails("Smitha S Dhage");
        repo.findUserDetails("smitha S Dhage","smithadhage812@gmail.com");
    }
}
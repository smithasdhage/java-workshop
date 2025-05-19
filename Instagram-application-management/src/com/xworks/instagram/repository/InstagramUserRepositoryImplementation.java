package com.xworks.instagram.repository;

import com.xworks.instagram.things.InstagramUserDetails;

public class InstagramUserRepositoryImplementation implements InstagramUserRepository {
    private InstagramUserDetails[] listOfUsers = new InstagramUserDetails[3];
    private int index = 0;
    @Override
    public void saveUserDetails(InstagramUserDetails details){
        System.out.println("details:"+details);
        if(this.index< listOfUsers.length){
            System.out.println("We can save the details");
            listOfUsers[this.index]= details;
            this.index++;
            System.out.println("Saved successfully");
        }else {
            System.err.println("Array is full we cannot save the data");
        }
    }
    @Override
    public void readInstagramUsers(){
        System.out.println("Reading Instagram User Details!!");
        for(InstagramUserDetails details : listOfUsers){
            System.out.println("User details:" +details);
        }
    }
    @Override
    public void findUserDetails(String name){
        System.out.println("Find User Details Method Inyoked");
        for(int i = 0; i < listOfUsers.length;i++){
            if(listOfUsers[i].getName().equalsIgnoreCase(name)){
                System.out.println("User is present");
                System.out.println("DETAILS ARE:"+listOfUsers[i]);
            }
        }
    }
    @Override
    public void findUserDetails(String name,String email){
        System.out.println("Find user details method invoked");
        for(int i=0;i<listOfUsers.length;i++)
            if (listOfUsers[i].getName().equalsIgnoreCase(name)&&listOfUsers[i].getEmail().equalsIgnoreCase(email)){
                System.out.println("User is present");
                System.out.println("User details are:"+listOfUsers[i]);
            }else{
                System.out.println("User is not present");
            }
    }
}

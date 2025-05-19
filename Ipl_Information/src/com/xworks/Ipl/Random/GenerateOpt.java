package com.xworks.Ipl.Random;
import java.util.Random;
public class GenerateOpt {
    public static void main(String[]args){
        Random random = new Random();
        int number = random.nextInt(1000,9999);
        System.out.println("number:"+number);
    }
}

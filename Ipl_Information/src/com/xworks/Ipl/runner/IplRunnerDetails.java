package com.xworks.Ipl.runner;
import com.xworks.Ipl.things.IplDetails;

import java.util.Scanner;

public class IplRunnerDetails {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details");
        System.out.println("Enter the team name");
        String teamName = scanner.next();
        System.out.println("Enter the captain name");
        String captainName = scanner.next();
        System.out.println("Enter the number of players:");
        int numberOfPlayers = scanner.nextInt();
        System.out.println("Enter the number of matches:");
        int numberOfMatches = scanner.nextInt();
        IplDetails iplDetails = new IplDetails();
        iplDetails.captainName = captainName;
        iplDetails.teamName = teamName;
        iplDetails.numberOfPlayers = numberOfPlayers;
        iplDetails.numberOfMatches = numberOfMatches;
        System.out.println("Team details are!!!");
        System.out.println("Team Name is:"+iplDetails.teamName);
        System.out.println("Captain Name is:"+captainName);
        System.out.println("Number Of Players:"+numberOfPlayers);
        System.out.println("Number of Matches:"+numberOfMatches);
    }
}
package Teme;

import org.testng.annotations.Test;

import java.security.PublicKey;

public class Tema1 {
    public char group;
    public int points;
    public boolean didItPlay;
    public String team;
    public String mvpPlayer;
    public String mvpPlayerRole;
    public double kda;
    public int matchesRemaining;
    public int matchesPlayed;
    public float longestMatch;

    @Test
    public void show(){
        group='A';
        points=21;
        didItPlay=true;
        team="T1";
        mvpPlayer="Faker";
        mvpPlayerRole="Mid";
        kda=4.0;
        matchesRemaining=3;
        matchesPlayed=7;
        longestMatch=28.12f;


        System.out.println("group "+group);
        System.out.println("points "+points);
        System.out.println("didItPlay "+didItPlay);
        System.out.println("team "+team);
        System.out.println("mvpPlayer "+mvpPlayer);
        System.out.println("mvpPlayerRole "+mvpPlayerRole);
        System.out.println("kda "+kda);
        System.out.println("matchesRemaining "+matchesRemaining);
        System.out.println("matchesPlayed "+matchesPlayed);
        System.out.println("longestMatch "+longestMatch);
        System.out.println();

        group='B';
        points=18;
        didItPlay=true;
        team="DK";
        mvpPlayer="ShowMaker";
        mvpPlayerRole="Mid";
        kda=3.78;
        matchesRemaining=5;
        matchesPlayed=5;
        longestMatch=33.12f;

        System.out.println("group "+group);
        System.out.println("points "+points);
        System.out.println("didItPlay "+didItPlay);
        System.out.println("team "+team);
        System.out.println("mvpPlayer "+mvpPlayer);
        System.out.println("mvpPlayerRole "+mvpPlayerRole);
        System.out.println("kda "+kda);
        System.out.println("matchesRemaining "+matchesRemaining);
        System.out.println("matchesPlayed "+matchesPlayed);
        System.out.println("longestMatch "+longestMatch);
        System.out.println();

        group='A';
        points=28;
        didItPlay=true;
        team="GenG";
        mvpPlayer="Canyon";
        mvpPlayerRole="Jungle";
        kda=2.67;
        matchesRemaining=1;
        matchesPlayed=9;
        longestMatch=29.43f;

        System.out.println("group "+group);
        System.out.println("points "+points);
        System.out.println("didItPlay "+didItPlay);
        System.out.println("team "+team);
        System.out.println("mvpPlayer "+mvpPlayer);
        System.out.println("mvpPlayerRole "+mvpPlayerRole);
        System.out.println("kda "+kda);
        System.out.println("matchesRemaining "+matchesRemaining);
        System.out.println("matchesPlayed "+matchesPlayed);
        System.out.println("longestMatch "+longestMatch);
        System.out.println();
    }

}

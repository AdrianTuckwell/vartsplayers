package com.codeclan.example.dartsplayers;

/**
 * Created by user on 07/11/2016.
 */

public class Player {
    private String name;
    private String nickname;
    private int ranking;

    public Player(String name, String nickname){
        this.name = name;
        this.nickname = nickname;
        this.ranking = 0;
    }

    /* You should be able to perform the following methods on a player:
            * Get/Set Name
            * Get/Set Nickname
            * Get/Set Ranking
    */

    public String getName(){
        return this.name;
    }

    public String setName(String newName){
        this.name = newName;
        return this.name;
    }

    public String getNickname(){
        return this.nickname;
    }

    public String setNickname(String newNickname){
        this.nickname = newNickname;
        return this.nickname;
    }

    public int getRanking(){
        return this.ranking;
    }

    public int setRanking(int newRank){
        this.ranking = newRank;
        return this.ranking;
    }

    // Override the default toString() method so that it returns a string
    // containing the player's details e.g.
    // "Name: Phil Taylor, Nickname: 'The Power', Ranking: 1"

    @Override
    public String toString() {
        return "Name: " + name + ", Nickname: " + nickname + ", Ranking: "+ ranking;
    }
}



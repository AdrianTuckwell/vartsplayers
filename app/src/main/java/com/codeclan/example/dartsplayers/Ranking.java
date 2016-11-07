package com.codeclan.example.dartsplayers;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class Ranking {

    private ArrayList<Player> ranking;

    // Ranking constructor
    public Ranking()
    {
        this.ranking = new ArrayList<Player>();
    }

    // Return the ranking size -------------------
    public int getSize()
    {
        return ranking.size();
    }

    // Add Player to Ranking ---------------------
    public void addPlayer(Player player)
    {
        ranking.add(player);
    }

    // check Player by Ranking/ ---------------------
    public Player checkRank(int rank)
    {
        return ranking.get(rank);
    }

    // check Player by Ranking/ ---------------------
    public Player removeRank(int rank)
    {
        return ranking.remove(rank);
    }



}

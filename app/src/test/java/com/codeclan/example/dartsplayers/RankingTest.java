package com.codeclan.example.dartsplayers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by user on 07/11/2016.
 */
public class RankingTest {

    Ranking ranking;
    Player player;
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;
    Player player6;
    Player player7;
    Player player8;
    Player player9;
    Player player10;
    Player player11;

    @Before
    public void before() {
        ranking = new Ranking();
        player1 = new Player("Jamie Harvey", "Bravedart");
        player2 = new Player("Alan Caves", "The Caveman");
        player3 = new Player("Allan Hogg", "Big Al");
        player4 = new Player("Anastasia Dobromyslova", "From Russia With Love");
        player5 = new Player("Andrew Davies", "Danger");
        player6 = new Player("Andy Fordham", "The Viking");
        player7 = new Player("Anne Kirk", "Captain Kirk");
        player8 = new Player("Aodhagan O'Neill", "The Silver Fox");
        player9 = new Player("Bob Anderson", "The Limestone Cowboy");
        player10 = new Player("Bob Taylor", "The Bear");
        player11 = new Player("Brendan Dolan", "The History Maker");
    }

    @Test
    public void testRankingGetSize()
    {
        assertEquals(0, ranking.getSize());
    }

    @Test
    public void testRankingHasTenPlayers()
    {
        ranking.addPlayer(player1);
        ranking.addPlayer(player2);
        ranking.addPlayer(player3);
        ranking.addPlayer(player4);
        ranking.addPlayer(player5);
        ranking.addPlayer(player6);
        ranking.addPlayer(player7);
        ranking.addPlayer(player8);
        ranking.addPlayer(player9);
        ranking.addPlayer(player10);
        assertEquals(10, ranking.getSize());
    }

    @Test
    public void testCheckRank()
    {
        ranking.addPlayer(player1);
        ranking.addPlayer(player2);
        ranking.addPlayer(player3);
        ranking.addPlayer(player4);
        ranking.addPlayer(player5);
        ranking.addPlayer(player6);
        ranking.addPlayer(player7);
        ranking.addPlayer(player8);
        ranking.addPlayer(player9);
        ranking.addPlayer(player10);
        player = ranking.checkRank(0);
        assertEquals("Jamie Harvey", player.getName());
    }

    @Test
    public void testUpdateRank()
    {
        ranking.addPlayer(player1);
        ranking.addPlayer(player2);
        ranking.addPlayer(player3);
        ranking.addPlayer(player4);
        ranking.addPlayer(player5);
        ranking.addPlayer(player6);
        ranking.addPlayer(player7);
        ranking.addPlayer(player8);
        ranking.addPlayer(player9);
        ranking.addPlayer(player10);
        player = ranking.removeRank(9);
        ranking.addPlayer(player11);
        player = ranking.checkRank(9);
        assertEquals("Brendan Dolan", player.getName());
    }
}
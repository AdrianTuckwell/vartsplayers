package com.codeclan.example.dartsplayers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by user on 07/11/2016.
 */
public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Jamie Harvey", "Bravedart");
    }

    @Test
    public void testPlayerGeters() {
        assertEquals("Jamie Harvey", player.getName());
        assertEquals("Bravedart", player.getNickname());
        assertEquals(0, player.getRanking());
    }

    @Test
    public void testPlayerSetters() {
        player.setName("Jamie Harvey2");
        player.setNickname("Bravedart2");
        player.setRanking(1);
        assertEquals("Jamie Harvey2", player.getName());
        assertEquals("Bravedart2", player.getNickname());
        assertEquals(1, player.getRanking());
    }

    @Test
    public void testToString(){
        assertEquals("Name: Jamie Harvey, Nickname: Bravedart, Ranking: 0", player.toString());
    }



}
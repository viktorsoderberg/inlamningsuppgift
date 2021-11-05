package inlamningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    @Test
    public void testGetRows() {
        WordCounter myCounter = new WordCounter();

        int actual = myCounter.getRows();

        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void testAddRows() {
        WordCounter myCounter = new WordCounter();

        myCounter.addRows();
        int actual = myCounter.getRows();

        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testGet5Rows() {
        WordCounter myCounter = new WordCounter();

        myCounter.addRows();
        myCounter.addRows();
        myCounter.addRows();
        myCounter.addRows();
        myCounter.addRows();

        int actual = myCounter.getRows();

        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCharacters() {
        WordCounter myCounter = new WordCounter();

        int actual = myCounter.getCharacters();

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetStop() {
        WordCounter myCounter = new WordCounter();

        myCounter.addCharacters("stop");
        boolean actual = myCounter.isGetStop();

        boolean expected = true;
        assertEquals(expected, actual);

    }

    @Test
    public void testItsNotStopped() {
        WordCounter myCounter = new WordCounter();

        myCounter.addCharacters("Leksand");
        boolean actual = myCounter.isGetStop();

        boolean expected = false;
        assertEquals(expected, actual);

    }



}

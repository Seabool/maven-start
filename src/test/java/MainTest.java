package seabool;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    private Main main;
    
    @Before
    public void setup() {
        main = new Main();
    }
    
    @Test
    public void testWordCountString() {
        int count = main.countWords("this is a test");
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = main.countWords("");
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = main.countWords(null);
        assertTrue(count == 0);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = main.countWords("this will be skipped");
        assertTrue(count == 3);
    }

    @Test
    public void testWordCountSingle() {
        int count = main.countWords("test");
        assertTrue(count == 1);
    }
}
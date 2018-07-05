package day4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AbbreviationTest {

    @Test
    public void check_data_after_split_data() {
        Abbreviation p = new Abbreviation();
        String[] result = p.split("United States of America");
        assertEquals(4, result.length);
        assertArrayEquals(
                new String[]{"United", "States", "of", "America"}, 
                result);
    }
    
    @Test
    public void filter_out_of_stop_word_from_data() {
        List<String> expected = new ArrayList<>();
        expected.add("United");
        expected.add("States");
        expected.add("America");
        Abbreviation p = new Abbreviation();
        List<String> result = p.filter("United States of America");
        assertEquals(3, result.size());
        assertEquals(expected, result);
    }
    
    @Test
    public void should_return_USA() {
        Abbreviation p = new Abbreviation();
        String result = p.of("United States of America");
        assertEquals("USA", result);
    }

}

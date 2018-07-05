package day4;

import java.util.ArrayList;
import java.util.List;

public class Abbreviation {

    public String[] split(String input) {
        return input.split("\\s");
    }

    public List<String> filter(String input) {
        String[] result = split(input);
        
        List<String> afterFilter = new ArrayList<>();
        for (String string : result) {
            if(!"of".equals(string)) {
                afterFilter.add(string);
            }
        }
        return afterFilter;
    }

    public String of(String input) {
        List<String> afterFilter = filter(input);
        
        String result = "";
        for (String string : afterFilter) {
            result += string.charAt(0);
        }
        return result.toUpperCase();
    }

}

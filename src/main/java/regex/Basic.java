package regex;

public class Basic {

    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.workingWithString();
    }

    private void workingWithString() {
        String input = "somkiat.p@gmail.com";
        String[] outputs = input.split("[.]");
        for (String out : outputs) {
            System.out.println(out);
        }
        
        boolean matched = input.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
        System.out.println(matched);
    }

}

package day4;

public class WorkingWithString {
    public static void main(String[] args) {
         String data = "Somkiat Pui Up1";
         System.out.println( data.charAt(0) );
         System.out.println( data.substring(data.length() - 1) );
         System.out.println( data.split(" ")[0] );
         System.out.println( data.split(" ")[1] );
         System.out.println( data.split(" ")[2] );
    }
}

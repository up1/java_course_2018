package kbtg;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DataType {

	public static void main(String[] args) {
		String input1 = "Hello";
		String input2 = "Somkiat";
		String r1 = input1 + " " + input2;
		String r2 
		  = String.format("%s %s", input1, input2);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(input1)
		      .append(" ")
		      .append(input2);
		
		StringBuilder builder = new StringBuilder();
		builder.append(input1)
		      .append(" ")
		      .append(input2);

		System.out.println(buffer);
		System.out.println(builder);
		System.out.println(r1);
		System.out.println(r2);
		System.out.printf("%s %s\n", input1, input2);
		
		
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = String.valueOf(1);
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.startsWith("He"));
		System.out.println(str1.endsWith("lo"));
		System.out.println(str1.indexOf("l"));
		
	}

}

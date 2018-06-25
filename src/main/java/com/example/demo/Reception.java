package com.example.demo;

public class Reception {

	private static final String ONE_SPACE = " ";

	public String get(String name) {
//		return String.join(" ", "สวัสดี", name);
//		return "สวัสดี " + name;
//		return "สวัสดี".concat(ONE_SPACE).concat(name);
//		StringBuilder builder = new StringBuilder();
//		builder.append("สวัสดี")
//		.append(ONE_SPACE)
//		.append(name);
//		return builder.toString();
		return String.format("สวัสดี %s" , name);
	}
}

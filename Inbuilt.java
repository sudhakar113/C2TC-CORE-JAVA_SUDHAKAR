package com.strings;

public class Inbuilt {
	public static void main(String[] args) {
		String s1="RajaRamMohanRoy";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(6));
		System.out.println(s1.codePointAt(6));
		System.out.println(s1.contains("Ram"));
		System.out.println(s1.getClass());
		System.out.println(s1.indexOf('R'));
		System.out.println(s1.lastIndexOf('M'));
		System.out.println(s1.isEmpty());
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(7,12));
		System.out.println(s1.length());
		char[] a=s1.toCharArray();
		System.out.println(a[6]);
		System.out.println(s1.indexOf('M'));
	}

}

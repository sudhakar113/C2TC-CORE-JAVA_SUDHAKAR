package com.strings;

public class Demo {

	public static void main(String[] args) {
	String s1="java";
	String s2="JAVA";
	if(s1==s2)
	{
		
		System.out.println("references are equal");
	}
	else
	{
		System.out.println("referencees are not equql");
	}
	if(s1.equals(s2)) 
	{
		System.out.println("values are equal");
		
	}
	else
	{
		System.out.println("values are not equal");
	}
	}
	}

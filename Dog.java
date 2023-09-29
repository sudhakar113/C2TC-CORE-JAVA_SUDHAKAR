package com.strings;

public class Dog {
	public static void main(String[] args) {
		String s1="java";
		String s2="JAVAC";
	int	res=s1.compareTo(s2);
	System.out.println(res);
	if(res==0)
	{
		System.out.println("String1 == String2");
	}
	else if(res>0)
	{
		System.out.println("string1 > string2");
	}
	else
	{
		System.out.println("string1 < string 2");
	}
	}
	

	}


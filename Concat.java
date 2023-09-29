package com.strings;

public class Concat {
	public static void main(String[] args) {
		
	String s1="JAVA";
	String s2="PYTHON";
	String s3=s1.concat(s2);
	String s4=s1.concat(s2);
	if(s3==s4)
	{
		System.out.println("references are equal");
	}
	else
	{
		System.out.println("references are not equal ");
	}
	if(s3.equals(s4))
	{
		System.out.println("values are equal");
	}
	else
	{
		System.out.println("values are not equal");
	}
}



}





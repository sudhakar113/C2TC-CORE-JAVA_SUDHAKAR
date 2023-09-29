package com.strings;

public class Demo1 {
public static void main(String[] args) {
	String s1="JAVA";
	String s2="PYTHON";
	String s3="JAVA+PYTHON";
	String s4="JAVA+PYTHON";
	if("JAVA+PYTHON"==s4)
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

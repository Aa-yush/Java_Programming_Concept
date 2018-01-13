

/* 
Q:- 1. Write a Java program to perform the following operations on string(s) :  
(a) To concatenate two strings 
(b) To find the length of a given string 
(c) To convert a given string into upper case 
*
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/


public class StringOperation{
	public static void main(String[] args){
		String s1=new String("Hey !! My name is Ayush");
		String s2=new String(" Learning Java Programs");
		String s3=s1+s2;
		System.out.println("After Concatenation: "+s3);
		System.out.println("Length is: "+s3.length());
		System.out.println("Uppercase String is: "+s3.toUpperCase());
	}
}
/*
Output:-

After Concatenation: Hey !! My name is Ayush Learning Java Programs
Length is: 46
Uppercase String is: HEY !! MY NAME IS AYUSH LEARNING JAVA PROGRAMS

*/
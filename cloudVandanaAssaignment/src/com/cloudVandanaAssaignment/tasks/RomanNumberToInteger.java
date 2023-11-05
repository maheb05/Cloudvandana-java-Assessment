package com.cloudVandanaAssaignment.tasks;

import java.util.Scanner;

public class RomanNumberToInteger {
	
	static int value(char c) {
		
		if(c=='I') {
			return 1;
		}
		
		if(c=='V') {
			return 5;
		}
		
		if(c=='X') {
			return 10;
		}
		
		if(c=='L') {
			return 50;
		}
		
		if(c=='C') {
			return 100;
		}
		
		if(c=='D') {
			return 500;
		}
		
		if(c=='M') {
			return 1000;
		}
		return -1;
	}
	
	
	static int convertRomanToInt(String s) {
		
		int total = 0;
		
		for(int i=0;i<s.length();i++) {
			
			int s1 = value(s.charAt(i));
			
			if(i+1 < s.length()) {
				int s2 = value(s.charAt(i+1));
				
				if(s1 >= s2) {
					total += s1;
				}
				else {
					total = total - s1;
				}
			}
			else {
				total += s1;
			}
		}
		
		return total;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Rooman Number ");
		String s = scan.next();
		String s1 = s.toUpperCase();
		
		System.out.println("The integer of "+s1+" is "+convertRomanToInt(s1));
	}
}

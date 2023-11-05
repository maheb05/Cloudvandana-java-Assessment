package com.cloudVandanaAssaignment.tasks;

import java.util.Scanner;

public class Pangram {
	
	
	static void pangram(String s) {
		s = s.toLowerCase();
		
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		int count = 0;
		
		for(int i=0;i<alphabets.length();i++) {
			if(s.indexOf(alphabets.charAt(i)) >= 0) {
				count++;
			}
			else {
				break;
			}
		}
		
		if(count == 26) {
			System.out.println("Given String is a Pangram ");
		}
		else {
			System.out.println("Given String is not a Pangram ");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = scan.nextLine();
		
		pangram(s);
	}
}

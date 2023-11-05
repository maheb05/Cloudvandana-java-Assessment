package com.cloudVandanaAssaignment.tasks;

import java.util.Random;
import java.util.Scanner;

public class ShufflingElements {
	
	static void shufflingElements(int arr[]) {
		
		Random random = new Random();
		
		for(int i=0;i<arr.length;i++) {
			int j = random.nextInt(i+1);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size ");
		int n = scan.nextInt();
		
		System.out.println("Enter Elements ");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		shufflingElements(arr);
		System.out.println("Shuffled Elements ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}

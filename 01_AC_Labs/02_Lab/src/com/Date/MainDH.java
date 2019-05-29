package com.Date;

import java.util.Scanner;

public class MainDH {

	public static void main(String[] args) {
		
		CurrentTime c3 = new CurrentTime();
		
		Scanner keyboard = new Scanner(System.in);
		int myint =21;
		
		while(myint != 0) {
			c3 = new CurrentTime();
			c3.getDate();
			c3.getTime();
			System.out.println("\nPress any integer key to repeat and 0 to exit. ");
			myint =keyboard.nextInt();
		}
	}

}

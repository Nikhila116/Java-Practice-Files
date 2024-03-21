/*Imagine you're a treasure hunter exploring a mysterious island filled with hidden treasures. 
You have a map that contains the locations of various treasures, represented by coordinates (x, y). 
Your task is to write a Java program that reads this map file and helps you locate the treasures.
Create a Java program that reads a text file containing treasure coordinates (x, y) in the format "x y",
where x and y are integers separated by a space.
The program should prompt the user to enter their current location on the island as "Current X coordinate" 
and "Current Y coordinate".
After receiving the user's input, the program should calculate and display the distance between the user's 
location and each treasure location, sorted from nearest to farthest.
Finally, the program should ask the user if they want to continue searching for more treasures or exit.*/

package com.aaslin.FileOperations_Assignment;

import java.io.*;

import java.util.*;

public class TreasureHuntUsingFileOp {
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (BufferedReader br = new BufferedReader(
				new FileReader("D:\\work space\\FileOperations\\TreasureHunt.txt"))) {
			
			double min = Double.MAX_VALUE;

			int treasureX1 = 0;

			int treasureY1 = 0;

			Scanner sc = new Scanner(System.in);

			String line;

			System.out.println("Enter the current location on the island i.e 'X Coordinate':");

			int currentX = Integer.parseInt(sc.nextLine());

			System.out.println("Enter the current location on the island i.e 'Y Coordinate':");

			int currentY = Integer.parseInt(sc.nextLine());
			
			int i = 0;

			while ((line = br.readLine()) != null) {

				// System.out.println(line);

				String[] setOfNumbers = line.split("\\s+");

				int treasureX = Integer.parseInt(setOfNumbers[0]);

				int treasureY = Integer.parseInt(setOfNumbers[1]);

				double distance = Math.sqrt(Math.pow(treasureX - currentX, 2) + Math.pow(treasureY - currentY, 2));
				
				i = i + 1;

				 System.out.println(" Tressure "+i+" at:"+"("+treasureX+" "+treasureY+")"+" "+"---> Distance: "+(int)distance);

				if (distance < min) {

					min = distance;

					treasureX1 = treasureX;

					treasureY1 = treasureY;

					// System.out.println("Tressure at:"+treasureX+" "+treasureY+" "+(int)distance);
				}

			}

			if (min == Double.MAX_VALUE) {

				System.out.println("Treasure not Found!!");

			} else {

				System.out
						.println("Nearest treasure at(" + treasureX1 + "," + treasureY1 + ") -> Distance:" + (int) min);

				System.out.println("Found the least distance to get the treasure cheers to you!!!");
			}

			/*
			 * System.out.println("Do you want to Continue the Tressure Hunt:('Yes/No'):");
			 * 
			 * String check = sc.nextLine().trim().toLowerCase();
			 * 
			 * if(!check.equals("yes")) {
			 * System.out.println("Exiting from the Tressure Hunt...."); }
			 */

		} catch (IOException | NumberFormatException e) {

			System.out.println(e.getMessage());
		}

	}

}

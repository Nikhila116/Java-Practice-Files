/*4. Implement a simple encryption and decryption program in Java. 
Prompt the user to enter a message, then encrypt the message using a simple substitution cipher, 
and write the encrypted message to a text file named "encrypted.txt". 
Provide a decryption program that reads the encrypted message from "encrypted.txt", decrypts it, 
and prints the original message to the console. 
Make sure to handle IO exceptions and invalid input gracefully.*/

package com.aaslin.FileOperations_Assignment;

import java.io.*;

import java.util.*;

public class Encryption_Decryption {

	public static void main(String[] args) {

		try {

			File f = new File("encrypted.txt");

			f.createNewFile();

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("please enter the message:");

			String message = reader.readLine();

			System.out.println("please enter the key:");

			Scanner sc = new Scanner(System.in);

			int key = sc.nextInt();

			// <--encrypting method-->
			String encrypted_Msg = encrypt(message, key);

			// <--writing to file-->
			writeToDestinationFile("encrypted.txt", encrypted_Msg);

			// <--decrypting the file to get the original text-->
			String decrypted_Msg = decryptFromFile("encrypted.txt", key);

			System.out.println("Encrypted Text is:" + encrypted_Msg);

			System.out.println("Decrypted Text is:" + decrypted_Msg);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	// message encrypting...
	public static String encrypt(String message, int key) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);

			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					sb.append((char) ('A' + (ch - 'A' + key) % 26));

				} else {
					sb.append((char) ('a' + (ch - 'a' + key) % 26));
				}
			} else {
				sb.append(ch);
			}
		}

		return sb.toString();
	}

	// writing to file...
	public static void writeToDestinationFile(String filename, String encrypted_Msg) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

			bw.write(encrypted_Msg);

			System.out.println("Message encrypted!! Succesfully");

		} catch (IOException i) {

			i.printStackTrace();

		}

	}

	public static String decryptFromFile(String filename, int key) {

		StringBuilder sb = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(decrypt(line, key));
			}

			return sb.toString();

		}

		catch (IOException e) {
			System.out.println(e.getMessage());

			return null;
		}

	}

	// decrypting the encrypted text

	public static String decrypt(String decrypt, int key) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < decrypt.length(); i++) {
			char ch = decrypt.charAt(i);

			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					sb.append((char) ('A' + (ch - 'A' + 26 - key) % 26));
				} else {
					sb.append((char) ('a' + (ch - 'a' + 26 - key) % 26));
				}
			}

			else {
				sb.append(ch);
			}
		}

		return sb.toString();
	}

}

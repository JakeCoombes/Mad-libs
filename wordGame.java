/* 
 * Jake Coombes
 * 9/21/2018
 * Word Game HW:
 * This code gets the users:
 * 		- name
 * 		- Their age
 * 		- The name of a city
 * 		- The name of a college
 * 		- A profession
 * 		- A type of animal
 * 		- A pet’s name
 * and puts it into a paragraph
 */

//import needed classes
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class wordGame 
{

	public static void main(String[] args) 
	{	// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in); //allows the code to get reading from user 
		
		//ask and scan for user input
		System.out.println("Please enter your Name: ");
		String name = reader.nextLine(); 
		
		System.out.println("Please enter your age: ");
		String age = reader.nextLine();
		
		System.out.println("Please enter a city: ");
		String city = reader.nextLine(); 
		
		System.out.println("Please enter a college's name: ");
		String college = reader.nextLine(); 
		
		System.out.println("Please enter a profession: ");
		String job = reader.nextLine(); 
		
		System.out.println("Please enter an animal: ");
		String animal = reader.nextLine(); 
		
		System.out.println("Please enter a pets name: ");
		String petName = reader.nextLine();  
		
		//print out story 1
		System.out.println("\n\nThere once was a person named " + name + " who lived in " + city + ".");
		System.out.println("At the age of " + age + ", " + name +" went to college at " + college + ".");
		System.out.println(name + " graduated and went to work as a " + job + ". ");
		System.out.println("Then, " + name + " adopted a(n) " + animal + " named " + petName + ". ");
		System.out.println("They both lived happily ever after!\n\n");
		
		//print out story 2
		System.out.println( name + " at the ripe old age of " + age + " decided to change up his life.");
		System.out.println(name + " decided to go to " + college + " and get a degree to become a(n) " + job + ".");
		System.out.println("Once " + name + " got the degree he went to " + city + " and shredded it into a million pieces.");
		System.out.println(name + " then proceeded to feed it to a(n) " + animal + " that " + name + " promptly named " + petName);

	}

}

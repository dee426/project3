package edu.cosc4353.group3.AcornsEmulator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class AppTest
{
	// Test for Customer class
    @Test
    public void testAddCustomer() {
    	Customer customer = new Customer("asdf","1234",1234);
    	assertEquals(1234, customer.getCardNumber());
    }
    // Test for Create User
    @Test
    public void testAddUser() {
    	Scanner input = new Scanner(System.in);
		
		System.out.println("Enter User: ");
		String username = input.next();
		
		System.out.println("Enter Password: ");
		String password = input.next();
		
		System.out.println("Enter Credit Card Number");
		int cardNumber = input.nextInt();
		
		Customer customer = new Customer(username, password, cardNumber);
		assertEquals(cardNumber, customer.getCardNumber());
    }
    // TODO make test for calling UserCreation
    //@Test
    //public void Test() {
    //	UserCreation.createUser();
    //}
}
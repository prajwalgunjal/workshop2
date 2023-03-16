package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Contact contact= new Contact();
    Scanner sc = new Scanner(System.in);
    // here we have to accept the inputs
    public void addContact(){
        System.out.println("Enter the name : ");
        String firstname = sc.next();
        contact.setName(firstname);
        System.out.println("Enter age");
        int age = sc.nextInt();
        contact.setAge(age);
        System.out.println("Enter phone number");
        String phone=sc.next();
        contact.setPhoneNumber(phone);
        System.out.println("Enter city");
        String city = sc.next();
        contact.setCity(city);
        System.out.println("Enter state: ");
        String state = sc.next();
        contact.setState(state);
    }
    void display(){
        System.out.println("**************************");
        System.out.println("name is "+contact.getName());
        System.out.println("city is "+contact.getCity());
        System.out.println("phone number is "+contact.getPhoneNumber());
        System.out.println("age is "+contact.getAge());
        System.out.println("state is "+contact.getState());
        System.out.println("***************************");
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contact=" + contact +
                '}';
    }
}
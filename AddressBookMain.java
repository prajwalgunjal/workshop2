package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        AddressBook addressBook2 = new AddressBook();
        AddressBook[] Address = new AddressBook[10];
        while(true) {
        System.out.println("What you want to perforem");
        System.out.println("1) add contact \n 2) add new address book\n3 exit ");
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
            switch (choice) {
                case 1 -> {
                    addressBook.addContact();
                    System.out.println(addressBook);
                    for(int i=0;i<Address.length;i++) {
                        Address[0] = addressBook;
                    }
                }
                case 2 -> {
                    addressBook2.addContact();
                    System.out.println(addressBook2);
                    //addressBook2.display();
                }
                case 3 -> {
                    System.exit(0);
                }
                case 4 -> {
                    System.out.println("Enter which contatc to be printed ");
                    int find = sc.nextInt();
                        System.out.println(Address[find]);
                }
            }
        }




    }
}

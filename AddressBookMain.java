package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        AddressBook addressBook2 = new AddressBook();
        AddressBook[] Address = new AddressBook[10];
        AddressBook[] Address2 = new AddressBook[10];
        int count=0;
        while(true) {
        System.out.println("What you want to perforem");
        System.out.println("1) add contact \n 2) add new address book\n3 exit 4) print from address book 1 5 print for address book 2");
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
            switch (choice) {
                case 1 -> {
                    count++;
                    addressBook.addContact();
                    System.out.println(addressBook);
                        Address[count] = addressBook;
                }
                case 2 -> {
                    addressBook2.addContact();
                    System.out.println(addressBook2);
                    Address2[count]=addressBook2;
                    //addressBook2.display();
                }
                case 3 -> {
                    System.exit(0);
                }
                case 4 -> {
                    System.out.println("Enter which contatc to be printed for address one ");
                    int find = sc.nextInt();
                        System.out.println(Address[find]);
                }
                case 5 -> {
                    System.out.println("for 2nd address printing ");
                    System.out.println("Enter which contatc to be printed for address one ");
                    int find2 = sc.nextInt();
                    System.out.println(Address2[find2]);
                }
            }
        }




    }
}

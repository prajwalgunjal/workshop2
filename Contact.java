//2>Create multiple address books -> Create Contacts with details(name, age, phoneNumber,city,state) ->
//Add multiple contacts in each addressBook
//Also Maintain a dictionary of addressBooks through a Map(key->addressBookName , value->addressBook-Object)  ->
// Create 3 classes - AddressBook , Contact and AddressBookMain
package com.bridgelabz;
public class Contact {
    private String name;
    private int age;
        private String phoneNumber;
        private String city;
        private String state;
    public Contact() {
    }

    public Contact(String name, int age, String phoneNumber, String city, String state) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        Contacts contact = new Contacts("Adithya", "Roy ", "1/A/7 ", "Kerala ",
                "West Bengal", 700050L, 8910211371L, "adithya.com ");
        System.out.println("Name : " +contact.getFirstName()+ " " +contact.getLastName());
        System.out.println("Address : " +contact.getAddress());
        System.out.println("City : " +contact.getCity());
        System.out.println("State : " +contact.getState());
        System.out.println("Zip Code : " +contact.getZip());
        System.out.println("Phone Number : " +contact.getPhoneNumber());
        System.out.println("E-Mail Id : " +contact.getEmail());
    }
}

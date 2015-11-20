package com.company;


public class Mainmenu extends Fileio {

    public Mainmenu() {
        //do {
        System.out.println("Welcome to the Twittinator!");
        System.out.println("Please select an option from our menu.");
        System.out.println("(1) Login");
        System.out.println("(2) Register");
        System.out.println("(3) View public feed");
        System.out.println("(4) View a users profile");
        System.out.println("(5) Quit system");

        listChoice = Fileio.getSearch();
        while (listChoice < 1 || listChoice > 5) {
            System.out.println("Please make a valid choice.");
            listChoice = Fileio.getSearch();
        }
        //System.out.println("YOU MADE IT!!!!");
    }

    public static void Usermenu() {
        System.out.println("Welcome User");
        System.out.println("Please select an option from the user menu.");
        System.out.println("(1) Make a Tweet");
        System.out.println("(2) Check messages");
        System.out.println("(3) View public feed");
        System.out.println("(4) Follow a user");
        System.out.println("(4) View a users profile");
        System.out.println("(5) Edit your profile");
        System.out.println("(6) Quit system");

        listChoice = Fileio.getSearch();
        while (listChoice < 1 || listChoice > 6) {
            System.out.println("Please make a valid choice.");
            listChoice = Fileio.getSearch();
        }
    }


    public int getListChoice() {
        return listChoice;
    }
}
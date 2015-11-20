package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Csvio {
    static String choice;
    static int count=0;
    String tempName;

    public static void main(String[] args) {
        Csvio obj = new Csvio();
        obj.fileReader2();

    }
    public void getSearch() {
        //System.out.println("What is your user name?");
        Scanner addText = new Scanner(System.in);
        choice = (addText.nextLine());
        //System.out.println("Complete");
    }




    public static void PublicTweets() {
        String csvFile = "PublicTweets.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        System.out.println("");
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] inputLine = line.split(cvsSplitBy);
                    for(int i = 1; i<inputLine.length; i++) {
                        System.out.println(inputLine[0]);
                        System.out.println(inputLine[i]);
                        count++;
                    System.out.println("");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }




    public static void SubscibedTweets(String tempName) {
        String csvFile = "PrivateTweets.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            System.out.println("");

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] inputLine = line.split(cvsSplitBy);

                for(int i = 0; i<inputLine.length; i++) {
                    if (line.contains(tempName)) {
                        line = br.readLine();
                        String[] newInputLine = line.split(cvsSplitBy);

                        for(int j = 1; j<newInputLine.length; j++) {
                            System.out.println(newInputLine[0]);
                            System.out.println(newInputLine[j]);
                            System.out.println("");
                        }

                        //System.out.println(line);

                            //System.out.println(Arrays.toString(inputLine));
                            //inputLine[i]=inputLine[i+1];
                            //System.out.println(Arrays.toString(inputLine));
                            //System.out.println("Home Town: "+inputLine[1]);
                            //System.out.println("Hobbies: "+inputLine[2]);
                            //i=inputLine.length;
                            //System.out.println("");

                    }
                }
            }
            System.out.println("");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }








    public void fileReader2() {
        String csvFile = "Tweets.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] inputLine = line.split(cvsSplitBy);
                if (choice.equals(inputLine[0])) {
                    for(int i = 1; i<inputLine.length; i++) {
                        System.out.println(inputLine[i]);
                        count++;
                    }
                    System.out.println("");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }





    public static void UserInformation() {
    }
}
package com.company;
public class Main {


    public static void main(String[] args) {
        String loop="yay";
        String choice=null;
        boolean status = false;
        choice ="0";
        int listChoice = 0;
        String tempName;
        //Mainmenu.Usermenu();
        //Fileio.getSearch();
        //input.fileReader();
        //System.out.println(Fileio.getSearch());
        /////////////////listChoice = Fileio.getSearch();
        //System.out.println("asasas"+choice);
        do{
            Mainmenu input = new Mainmenu();
            input.Mainmenu();
            listChoice=input.getListChoice();
            if (listChoice==1) {
                Login user = new Login();
                Fileio.Login();
                status = user.getLoginStatus();
            }
            if (listChoice==2) {
                Register user = new Register();
                Fileio.Register();
                Fileio.RegisterUser();
            }
            if (listChoice==3) {
                Csvio.PublicTweets();
            }
            if (listChoice==4) {
                Csvio.UserInformation();
                UserInformation userInfo = new UserInformation();
            }
            if (listChoice==5) {
                System.out.println("Thank you for using our system!");
                System.exit(0);
            }
            while (status) {
                tempName = Login.getLoginName();
                Csvio.SubscibedTweets(tempName);
                Mainmenu.Usermenu();
                listChoice=input.getListChoice();
                if (listChoice==1) {

                }
                if (listChoice==2) {

                }
                if (listChoice==3) {
                    Csvio.PublicTweets();
                }
                if (listChoice==4) {
                    Csvio.UserInformation();
                    UserInformation userInfo = new UserInformation();
                }
                if (listChoice==5) {

                }
                if (listChoice==6) {
                    System.out.println("Thank you for using our system!");
                    System.exit(0);
                }
            }
            //Csvio input2 = new Csvio();
            //input2.getSearch();
            //input2.fileReader2();
            //input.fileAdd();
            //input.fileAdd();
            //input.fileAdd();
        } while (!choice.equals("Q") || !choice.equals("q"));
    }
}
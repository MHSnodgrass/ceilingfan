package ca.medavieassessment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    boolean exitFlag = false;
        int userChoice;
        Scanner myScanner = new Scanner(System.in);
        CeilingFan testFan = new CeilingFan();

        while(!exitFlag) {
            System.out.println(testFan.toString());

            System.out.println("What would you like to do?");
            System.out.println("1: Increase speed");
            System.out.println("2: Change direction");
            System.out.println("3: Exit program");
            System.out.print("Choice: ");

            String tempChoice = myScanner.nextLine();
            try {
                userChoice = Integer.parseInt(tempChoice);
                if (userChoice >= 1 && userChoice <= 3) {
                    switch(userChoice) {
                        case 1:
                            testFan.pullSpeedCord();
                            break;
                        case 2:
                            testFan.pullDirectionCord();
                            break;
                        default:
                            exitFlag = true;
                            break;
                    }
                } else {
                    System.out.println("Choice was not valid, please enter either 1, 2, or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Choice was not valid, please enter either 1, 2, or 3.");
            }
        }
    }
}

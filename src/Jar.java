import java.util.Scanner;

public class Jar {
    /* Create a program that takes ideas, then stores them.
    *  Create the app in an infinite loop until the user quits out.
    *  After each function, allow the user to continue or not.
    *  Store the ideas in a list.
    *  Place the list inside of a file.
    *  -
    *  Allow users to read all items in the list.
    *  -
    *  Allow users to edit specific items in the list.
    *  -
    *  Allow users to delete specific items in the list.
    *  -
    *  Allow users to get a randomized result from the list.
    *  -
    *  Allow users to exit.*/

    public Scanner keyboard = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("Welcome to the Idea Jar! \n" +
                "Select from the corresponding menu choices \n" +
                "1.) Create new idea jar \n" +
                "2.) Read ideas from current jar \n" +
                "3.) Edit idea from current jar \n" +
                "4.) Delete idea from current jar \n" +
                "5.) Get an idea! \n" +
                "6.) Exit program");
    }

    public void menuChoice(){
        int userMenuChoice = 0;

        System.out.print("What is your choice: ");

        while(true){
            if(keyboard.hasNextInt()){
                userMenuChoice = keyboard.nextInt();
                if(userMenuChoice > 0 && userMenuChoice < 7){
                    System.out.print("Good");
                    // Add switch statement with all menu options.
                    break;
                }else{
                    System.out.print("Invalid range. Please try again: ");
                }
            }else{
                System.out.print("Invalid input. Please try again: ");
                keyboard.next();
            }
        }
    }

    public void continueChoice(){
        // Get user input.
        String userContinueChoice;

        while(true){
            System.out.print("Would you like to run again? (Y or N): ");
            userContinueChoice = keyboard.nextLine();

            if(userContinueChoice.equalsIgnoreCase("y")){
                displayMenu();
                menuChoice();
                break;
            }else if(userContinueChoice.equalsIgnoreCase("n")){
                System.out.println("Have a nice day!");
                System.exit(1);
            }else{
                System.out.println("Invalid input. ");
            }
        }
    }
}

import java.util.Scanner;
import java.io.*;

public class Jar {
    /* Create a program that takes ideas, then stores them. [Done]
    *  Create the app in an infinite loop until the user quits out. [Done]
    *  After each function, allow the user to continue or not. [Done]
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

    Scanner keyboard = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("Welcome to the Idea Jar! \n" +
                "Select from the corresponding menu choices \n" +
                "1.) Create new idea jar \n" +
                "2.) Read ideas from current jar \n" +
                "3.) Edit idea from current jar \n" +
                "4.) Delete idea from current jar \n" +
                "5.) Get an idea! \n" +
                "6.) Exit program");

        menuChoice();
    }

    public void menuChoice(){
        int userMenuChoice;

        System.out.print("What is your choice: ");

        while(true){
            if(keyboard.hasNextInt()){
                userMenuChoice = keyboard.nextInt();
                if(userMenuChoice > 0 && userMenuChoice < 7){
                    // Add switch statement with all menu options.
                    switch(userMenuChoice){
                        case 1:
                            keyboard.nextLine();
                            createJar();
                            break;
                        case 2:
                            System.out.println("Option 2");
                            break;
                        case 3:
                            System.out.println("Option 3");
                            break;
                        case 4:
                            System.out.println("Option 4");
                            break;
                        case 5:
                            System.out.println("Option 5");
                            break;
                        case 6:
                            System.out.println("Option 6");
                            break;
                    }
                    keyboard.nextLine();
                    continueChoice();
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
        do{
            System.out.print("Would you like to run again? (Y or N): ");
            userContinueChoice = keyboard.nextLine();

            if(userContinueChoice.equalsIgnoreCase("y")){
                displayMenu();
            }else if(userContinueChoice.equalsIgnoreCase("n")){
                System.out.println("Have a nice day!");
                System.exit(1);
            }else{
                System.out.println("Invalid input. ");
            }
        }while(true);
    }

    public void createJar(){
        String userContinueChoice;
        File jarFile = new File("idea-jar.txt");
        System.out.println("Creating Jar...");

        do{
            System.out.println("Would you like to add an idea? (y or n): ");
            userContinueChoice = keyboard.nextLine();
            if(userContinueChoice.equalsIgnoreCase("y")){
                System.out.println("adding new");
                try{
                    if(jarFile.createNewFile()){
                        FileWriter jarWriter = new FileWriter("idea-jar.txt", true);
                        System.out.println("Jar created");
                        System.out.println("Add an idea: ");
                        jarWriter.write(keyboard.nextLine() + "\n");
                        jarWriter.close();
                    }else{
                        FileWriter jarWriter = new FileWriter("idea-jar.txt", true);
                        System.out.println("Add an idea: ");
                        jarWriter.write(keyboard.nextLine() + "\n");
                        jarWriter.close();
                    }
                }catch(IOException e){
                    System.out.println("There was an error");
                    e.printStackTrace();
                }
            }else if(userContinueChoice.equalsIgnoreCase("n")){
                continueChoice();
            }else{
                System.out.println("Invalid");
            }
        }while(true);
    }
}

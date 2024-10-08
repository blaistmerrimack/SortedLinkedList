package SortedLinkedListImp;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The main driver class for the Module04tblais package, which prompts the 
 * user to enter integer values to be added to a Sorted Linked List data 
 * structure. 
 * @author Timothy Blais
 * @version 1.0.0
 * @since September 24, 2024
 */
public class Main {
    /**
     * Default constructor for Main.
     * Implements the class object with default settings.
     */
    public Main(){};
    
    /**
     * Main method of the class, which creates an instance of the 
     * SortedLinkedList class, then prompts the user to enter integer values 
     * to be added and sorted into the Linked list. The SortedLinkedList class
     * implements a LinkedList object from the Java Collections framework, and 
     * exposes methods to add values to and print the linked list, promoting 
     * code re-use and abstracting out implementation details and repeated 
     * method calls to sort the list upon each new value being added.
     * @param args Default parameter for main method
     */
    public static void main(String[] args) {
        
        /* Defines the type of Demo and appropriate class for storing values. 
        Setting these as variables allows for ease of edits should we choose
        to update the program to use another data structure. */
        String demoType = "Sorted Linked List";
        SortedLinkedList myList = new SortedLinkedList();

        System.out.println("\nWelcome! This program demonstrates adding values"
        + " to a " + demoType);

        /* Primary loop of the program. Prompts the user for integers to add
         * to the Sorted Linked List until the user exits. Rather than interact
         *  directly with the LinkedList collections class, functions related 
         * to adding and sorting have been encapsulated into the 
         * SortedLinkedList object and can be called here, improving our 
         * ability to maintain the program and re-use this code for other data 
         * structures if desired.
         */
        Scanner userInput = new Scanner(System.in);
        int value = 1;
        while (value != 0) {
            System.out.println("\nPlease enter an integer to add to the " + 
            demoType + ". Enter 0 to exit the program.");
            try{
                value = userInput.nextInt();
                if (value == 0) {
                    System.out.println("\nGoodbye!");
                } else {
                    // Call SortedLinkedList methods to add values and print
                    // the sorted linked list.
                    myList.addValue(value);
                    System.out.println("\nThe current " + demoType + " is:");
                    myList.printValues();
                }
            } catch (InputMismatchException a) {
                System.out.println("\nInvalid input!");
                userInput.next();
            }
        }
        // Close scanner.
        userInput.close();
    }
}

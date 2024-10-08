package SortedLinkedListImp;
import java.util.LinkedList;

/**
 * Class for a Linked List of integer values sorted from smallest to largest.
 * This class implements a linked list using the LinkedList Class from the 
 * java collections framework. The class includes methods to add new values to 
 * the Linked List, sorting the list whenever a new value is added, as well as 
 * to print the values included in the Sorted Linked List.
 */
public class SortedLinkedList {
    private LinkedList<Integer> linkedList;

    /**
     * Constructor for the SortedLinkedList Class. Initializes the object with 
     * a LinkedList attribute, which holds an empty LinkedList of integers 
     * instantiated from the LinkedList class from the java collections 
     * framework. Using the existing LinkedList class from the framework is an 
     * example of code re-use, allowing us to take advantage of existing 
     * structure and methods for this class and add features to fit our needs.
     */
    public SortedLinkedList() {
        this.linkedList = new LinkedList<Integer>();
    }

    /**
     * Method to add new values to the Linked List. This method takes advantage
     *  of the built in add() and sort() methods for the Java Collections 
     * Framework LinkedList class, re-using the code from these methods to 
     * quickly and easily add new values and sort the list from smallest to
     * largest.
     * @param newVal integer value to add to the linked list in the correct 
     * sorted location.
     */
    public void addValue(int newVal){
        // Call LinkedList class methods to add a value and then sort the list.
        linkedList.add(newVal);
        linkedList.sort(null);
        System.out.println("\n" + newVal + " added to the List!");
    }

    /**
     * Method to print the values of the Sorted Linked list. This method acts
     * as a getter method to print the values of the class linkedList 
     * attribute.
     */
    public void printValues() {
        System.out.println(linkedList);
    }
}
# SortedLinkedList

This program demonstrates how re-use of code helps to improve code quality, makes it easier to build out programs quickly, and makes those programs easier to maintain and update in the future. The program implements a Linked List data structure where the list of integers is ordered from smallest to largest. To accomplish this, the LinkedList class from the Java Collections Framework is used as the primary building block for the data structure, and its methods for adding items to the list and sorting the list are re-used within the program to implement the sorted list requirement. The .add() and .sort() methods are inherited from parent interfaces within the framework, demonstrating how re-use of functionality through inheritance can benefit us when building programs. In addition, the SortedLinkedList class was created to encapsulate functions related to the Sorted Linked List, and the exposed methods to add items to the list and print the list are re-used within the Main function of the program. This is important, as the main program simply wants to add values to the SortedLinkedList and does not need to concern itself with how those values are added and sorted. This structure simplifies the main program, and makes it easier for us to make changes in the future should we wish to adjust the data structure used. The included UML diagram shows the relevant methods from the framework used within this program and how the classes interact.

This program includes 2 files as part of the SortedLinkedListImp Package: Main and SortedLinkedList. This program implements a simple class for a Sorted Linked List that prompts the user to add integer values to the list and adds those values in the correct place in the list. Please note that this program requires java 8 or above in order to take advantage of the default sort() method within the LinkedList class. The program can be run from the command line using the following commands.:

To compile:
From the parent directory of SortedLinkedListImp run the command: javac -d . SortedLinkedListImp\Main.java

To run:
From the parent directory of SortedLinkedListImp run the command: java SortedLinkedListImp.Main

Javadoc html files are included for each class under SortedLinkedListImp/javadoc/SortedLinkedListImp, or can be generated using the “javadoc -d SortedLinkedListImp\javadoc SortedLinkedListImp” command from the package’s parent directory.

package UI;

import task.Task;
import task.TaskList;

import java.util.Scanner;

public class Ui {
    public static final String WRONG_INPUTS_GIVEN = "Wrong inputs given";
    public static final String LINE = "____________________________________________________________";
    public static final String UNRECOGNISED_INPUT = "☹ OOPS!!! I'm sorry, but I don't know what that means :-(";
    public static final String UNRECOGNISED_ITEM_INDEX = "☹ OOPS!!! unrecognised item index!";
    public static final String EMPTY_DESCRIPTION = "☹ OOPS!!! The description cannot be empty.";
    public static final String UNRECOGNISED_TASKTYPE = "☹ OOPS!!! I do not recognise the type of task";
    public static final String FILE_PATH = "data.txt";
    public static final String FILE_ACCESS_ERROR = "File access failed!";
    public static final String FILE_UPDATING_ERROR = "File update failed!";
    public static final String FILE_LOADING_ERROR = "File loading failed!";
    public static final String FILEWRITER_CREATION_ERROR = "Filewriter object creation failed!";

    public static void showError(String constant) {
        System.out.println(LINE);
        switch (constant) {
        case "WRONG_INPUTS_GIVEN":
            System.out.println(WRONG_INPUTS_GIVEN);
            break;
        case "UNRECOGNISED_INPUT":
            System.out.println(UNRECOGNISED_INPUT);
            break;
        case "UNRECOGNISED_ITEM_INDEX":
            System.out.println(UNRECOGNISED_ITEM_INDEX);
            break;
        case "EMPTY_DESCRIPTION":
            System.out.println(EMPTY_DESCRIPTION);
            break;
        case "FILE_PATH":
            System.out.println(FILE_PATH);
            break;
        case "FILE_ACCESS_ERROR":
            System.out.println(FILE_ACCESS_ERROR);
            break;
        case "FILE_UPDATING_ERROR":
            System.out.println(FILE_UPDATING_ERROR);
            break;
        case "FILE_LOADING_ERROR":
            System.out.println(FILE_LOADING_ERROR);
            break;
        default:
            System.out.println("Invalid constant string");
        }
        System.out.println(LINE);
    }

    public static void greet() {
        System.out.println(LINE);
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");
        System.out.println(LINE);
    }

    public static void bye() {
        System.out.println(LINE);
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println(LINE);
    }

    public static void showError(Exception e) {
        System.out.println(LINE);
        System.out.println(e.getMessage());
        System.out.println(LINE);
    }

    public static void printLine() {
        System.out.println(LINE);
    }

    public static String getUserInput() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine().trim();
        return userInput;
    }

    public static void printList() {
        if(TaskList.list.size() == 0) {
            System.out.println(LINE);
            System.out.println("Nothing on your list yet!");
            System.out.println(LINE);
        } else {
            System.out.println(LINE);
            System.out.println("Here are the tasks in your list:");
            for (int i = 0; i < TaskList.list.size(); i += 1) {
                System.out.println(Integer.toString(i+1) + "." + TaskList.list.get(i));
            }
            System.out.println(LINE);
        }
    }

    public static void markResponse(int index) {
        System.out.println(LINE);
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(TaskList.list.get(index));
        System.out.println(LINE);
    }

    public static void unmarkResponse(int index) {
        System.out.println(LINE);
        System.out.println("OK! I've marked this task as not done yet:");
        System.out.println(TaskList.list.get(index));
        System.out.println(LINE);
    }

    public static void printConfirmation(Task newTask, String action) {
        System.out.println(LINE);
        switch(action) {
        case "add":
            System.out.println("I've added this task:");
            System.out.println(newTask);
            break;

        case "delete":
            System.out.println("I've removed this task:");
            System.out.println(newTask);
            break;
        }
        System.out.println("Now you have " + TaskList.list.size() + " tasks in the list");
        System.out.println(LINE);
    }
}
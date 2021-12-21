package com.careerdevs;

public class Main {

    public static void main(String[] args) {
	    // algorithm 1
        System.out.println(getFirstElement(new int[] {3, 1, 4}));

        // algorithm 2
        System.out.println(addition(3));

        // algorithm 3
        System.out.println(search(new int[]{1, 2, 3, 4}, 3));

        // algorithm 4
        System.out.println(convert(2));

        // algorithm 5
        System.out.println(giveMeSomething("something"));




    }

    //algorithm 1 getFirstElement
    public static int getFirstElement (int[] arr) {
        return arr[0];
    }

    //algorithm 2 addition
    public static int addition(int num) {
        return num + 1;
    }

    // algorithm 3 search
    public static int search(int arr[], int item) {
      //  return arr.indexOf(item);
        return 0;
    }

    //algorithm 4 convert
    public static int convert(int minutes) {
        return minutes * 60;
    }

    // algorithm 5 giveMeSomething
    public static String giveMeSomething(String a) {
        return "something " + a;
    }


}

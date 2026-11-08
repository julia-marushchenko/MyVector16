/**
 *  Java program to create, update, display, and clear instance of Vector.
 */

package com.mycollections;

import java.util.Vector;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Vector<Integer> myVector = new Vector<>();

        // Add.
        myVector.add(2);
        myVector.add(3);
        myVector.add(1);
        myVector.add(0);
        myVector.add(4);

        // Read.
        System.out.println(myVector); // Output: [2, 3, 1, 0, 4]

        // Update.
        myVector.add(3, 7);

        // Read.
        System.out.println(myVector); // Output: [2, 3, 1, 7, 0, 4]

        // Clear.
        myVector.clear();

    }
}
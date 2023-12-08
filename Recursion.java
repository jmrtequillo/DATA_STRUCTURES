/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursion;

/**
 *
 * @author eizel
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Recursion {
    public static void main(String[] args) {
        Integer arrayA[] = {1, 2, 3, 4, 5};
        int arrLen = arrayA.length;
        

        ArrayList<Integer> AreyL = new ArrayList<>(Arrays.asList(arrayA));
        AreyL.add(6);
        Iterator<Integer> ListElement = AreyL.iterator();
        recur(ListElement);
 
    }

    static void recur(Iterator<Integer> TequilloListElement) {
        while (TequilloListElement.hasNext()) {
            
            System.out.println(TequilloListElement.next());
            recur(TequilloListElement);
            
        }
    }
}
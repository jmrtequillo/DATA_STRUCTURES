/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tequilloarrays;

/**
 *
 * @author eizel
 */
import java.util.Arrays;

public class TequilloArrays {
    public static void main(String[] args) {
       
        int arrayko[] = {1, 2, 3, 4, 5};
        int MyarrLen = arrayko.length;
        int MNArrLen = MyarrLen + 1;
        int nae = 1;
        int newArr[] = new int[MNArrLen];
        
        System.out.println("Original Length: " + MyarrLen);
        System.out.print("Added Elemet: " + nae);
        System.out.println("");
        
        System.out.println("New Length: " + MNArrLen);
        System.out.println("");
        
        for (int i = 0; i < MyarrLen; i++) {
            newArr[i] = arrayko[i];
        }
        
        newArr[MNArrLen - 1] = 6;
        
        for (int i = 0; i < MNArrLen; i++) {
            System.out.println(newArr[i]);
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Write a program to print a letters from the user input character to 'Z' without using
// strings.
// Example 1:  input : X
// Output : XYZ
import java.util.*;
/**
 *
 * //
 */
public class question_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character:");
        char s=sc.next().charAt(0);
        for(char i=s;i<='Z';i++){
            System.out.print(i);
        }
    }
}

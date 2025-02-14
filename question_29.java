/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aaki1
 * run:
4
****
*
*
****
BUILD SUCCESSFUL (total time: 2 seconds)
 */
import java.util.*;
public class question_29 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

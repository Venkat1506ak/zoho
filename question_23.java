/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aaki1
 */
/*
run:
9
 9 9 9 9 9 9 9 9 9 
  8 8 8 8 8 8 8 8 
   7 7 7 7 7 7 7 
    6 6 6 6 6 6 
     5 5 5 5 5 
      4 4 4 4 
       3 3 3 
        2 2 
         1 
BUILD SUCCESSFUL (total time: 4 seconds)
*/
import java.util.*;
public class question_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            int m=n-i;
            for(int j=n-i;j>0;j--){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}


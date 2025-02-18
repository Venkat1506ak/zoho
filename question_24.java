/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aaki1

 run:
5
    1 
   2 3 
  4 5 
BUILD SUCCESSFUL (total time: 5 seconds)
 */
import java.util.*;
public class question_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;num<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            int m=n-i;
            for(int j=0;j<i&&num<=n;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

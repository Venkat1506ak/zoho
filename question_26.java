/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author aaki1
 */
public class question_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n*2;
        for(int i=0;i<m-1;i++){
//            if(i<n){
            int stars=Math.abs(n-1-i);
            int space=(n-stars-1)*2;
            for(int j=0;j<=stars;j++){
                System.out.print("*"); 
            }   
            for(int j=0;j<space;j++){
                System.out.print("_");
            }
            for(int j=0;j<=stars;j++){
                System.out.print("*");
            }
             System.out.println();
        }           
    }
}

//            }
//            else {
//                int k = i - n + 2;
//                for (int j = 0; j < k; j++) {
//                    System.out.print("*");
//                }
//                for (int j = 0; j < (n - k - 1); j++) {
//                    System.out.print("__");
//                }
//                for (int j = 0; j <= k; j++) {
//                    System.out.print("*");
//                }
//                int k=1;
//                for(int j=0;j<i-n+2;j++){
//                    System.out.print("*"); 
//                }   
//                for(int j=i-2;j<=n+k--;j++){
//                    System.out.print("_ ");
//                    
//                }
//                for(int j=n;j>i;j--){
//                    System.out.print("*");
//                }
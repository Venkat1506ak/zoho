/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aaki1
 */
/*
input:9
output:
         1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
*/
import java.util.*;
public class question_20 {
//    public static int fact(int n){
//        int facto=1;
//        for (int i = 2; i <= n; i++) {
//            facto *= i;
//        }
//        return facto;
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
//            for(int j=0;j<=i;j++){
//                System.out.print((fact(i)/(fact(j)*fact(i-j)))+" ");
//            }
            int k=0;
            for(int j=0;j<=i;j++){
                
                System.out.print(++k);
            }
            
            for(int j=0;j<i;j++){
                
                System.out.print(--k);
            }
            System.out.println();
        }
    }
}

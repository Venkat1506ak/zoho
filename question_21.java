
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aaki1
 */
/*intput :5

output:
     5
    454
   34543
  2345432
 123454321
*/
public class question_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=n+1,l=n;
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
//            for(int j=0;j<=i;j++){
//                System.out.print((fact(i)/(fact(j)*fact(i-j)))+" ");
//            }
//            int k=0;
            m=m-i-1;
            for(int j=0;j<=i;j++){
                
                System.out.print(m++);
            }
            
            for(int j=0;j<i;j++){
                
                System.out.print(--l);
            }
            System.out.println();
        }
    }
}

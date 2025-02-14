/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aaki1
 */
/*run:
123
1 3
 2 
1 3
BUILD SUCCESSFUL (total time: 3 seconds)
*/
import java.util.*;
public class question_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int o=0;
        int count=0;
        while(n!=0){
            o=o*10+n%10;
            n/=10;
            count++;
        }
//        System.out.println(m);
//        System.out.println(o);
        for(int i=0;i<count;i++){
            int s=count-i-1;
            for(int j=0;j<count;j++){
                if(i==j && j==s){
                    System.out.print(o%10);
                    o/=10;
                    m/=10;
                }
                else if(i==j){
                    System.out.print(o%10);
                    o/=10;
                }
                else if(s==j){
                    System.out.print(m%10);
                    m/=10;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

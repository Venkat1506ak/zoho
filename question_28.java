/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author aaki1
 */
/*
run:
5
12345
BUILD SUCCESSFUL (total time: 3 seconds)
*/
public class question_28 {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        
        for(int i=1;i<=n;i++){
            int sam=0;
            for(int j=1;j<=i;j++){
                sam=sam*10+1;
            }
            sum+=sam;
        }
        System.out.println(sum);
    }
}

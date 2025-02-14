/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author aaki1
 */
public class question_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        if(str1.contains(str2)){
                System.out.println(str1.indexOf(str2));
            }
        else{
            System.out.println(-1);
        }
        
    }
}

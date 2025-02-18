/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author aaki1
 */
 public static String reverse(String str){
        if (str.isEmpty() || !str.contains(" ")) {
            return str;
        }
        int firstindex=str.indexOf(" ");
        
        String firstword=str.substring(0,firstindex);
        
        String rem=str.substring(firstindex+1);
            
        return reverse(rem)+" "+firstword;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        System.out.println(reverse(s));
    }
}

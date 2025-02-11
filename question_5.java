/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author aaki1
 */
public class question_5 {
    public static void main(String[] args) {
        int a=2,b=16
                ,c=4;
          int s=b*b-(4*a*c);
          double x1=0,x2=0;
        if(s>0){
            double m=Math.sqrt(s);
            x1=(-b+(m))/2*a;
            x1=(-b-(m))/2*a;
        }
        System.out.println(x1);
        System.out.println(x2);
    }
}

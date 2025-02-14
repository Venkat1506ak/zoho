/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author aaki1
 */
public class question_18 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i+=2){
            for(int j=i;j<arr.length;j+=2){
                if(arr[i]<arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        for(int i=1;i<arr.length;i+=2){
            for(int j=i;j<arr.length;j+=2){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

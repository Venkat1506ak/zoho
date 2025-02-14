/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author aaki1
 */
public class question_17 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        
        int n=arr.length;
        int result[]=new int[arr.length];
        int left=0,right=arr.length-1,index=0;
        while(left<=right){
            if(index<n){
                result[index++]=arr[right--];
//                arr[index]=arr[index]+arr[right];
//                arr[right]=arr[index]-arr[right];
//                arr[index]=arr[index]-arr[right];
//                index++;
//                right--;
            }
            if(index<n){
                result[index++]=arr[left++];
//                arr[index]=arr[index]+arr[left];
//                arr[left]=arr[index]-arr[left];
//                arr[index]=arr[index]-arr[left];
//                index++;
//                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

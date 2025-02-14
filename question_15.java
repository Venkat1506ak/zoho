/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author aaki1
 */
public class question_15 {
    public static void main(String[] args) {
        int[] s={1,2,3,3,2,2,6};
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i=0;i<s.length;i++){
             if(!(map.containsKey(s[i]))){
                 map.put(s[i], 1);
             }
             else{
                 map.put(s[i], map.get(s[i])+1);
             }
         }
         for(Integer key:map.keySet()){
             if(map.get(key)>1){
                 System.out.println(key);
             }
         }
    }
}

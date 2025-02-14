/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author aaki1
 */
public class question_16 {
    public static void main(String[] args) {
        int[] s={1,2,3,3,2,2,6};
        int[] s1={7,6,5,4,3,2,1};
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i=0;i<s.length;i++){
             if(!(map.containsKey(s[i]))){
                 map.put(s[i], 1);
             }
         }
         for(int i=0;i<s1.length;i++){
             if(!(map.containsKey(s1[i]))){
                 map.put(s1[i], 1);
             }
         }
         int[] keyArray = map.keySet().stream().mapToInt(Integer::intValue).toArray();
          System.out.println(Arrays.toString(keyArray));
//         for(Integer key:map.keySet()){
//             System.out.println(key);
//         }
    }
}

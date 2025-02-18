/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author aaki1
 * run:
[1]
[2, 4]
[3, 5, 7]
[6, 8]
[9]
BUILD SUCCESSFUL (total time: 1 second)
 */
public class question_30 {
    public static void main(String[] args) {
        
        int[][] sam={{1,2,3},{4,5,6},{7,8,9}};
        int n=sam.length;
        List<List<Integer>> s = new ArrayList<>();
        
        for(int i=0;i<2*n-1;i++){
            s.add(new ArrayList<>());
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<sam[i].length;j++){
                s.get(i+j).add(sam[i][j]);
            }
        }
        for (List<Integer> list : s) {
            System.out.println(list);
        }
    }
}

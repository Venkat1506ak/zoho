/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aaki1
 */
import java.util.*;
public class question_19 {
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int row=mat.length;
        int col=mat[0].length;
        
        for(int i=0;i<row;i++){
            int first=mat[i][0];
            for(int j=0;j<col-1;j++){
                mat[i][j]=mat[i][j+1];
            }
            mat[i][col-1]=first;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

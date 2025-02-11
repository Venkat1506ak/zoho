/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aaki1
 */
public class question_3 {
    public static void main(String[] args) {
        int n=101;
        int[][] sam=new int[4][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                sam[j][i]=n++;
            }
        }
        for(int i=0;i<4;i++){
            System.out.println("Group "+(i+1)+":");
            for(int j=0;j<5;j++){
                System.out.println(sam[i][j]);
            }
            System.out.println("");
        }
    }
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orosz
 */
public class MatrixOsszeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    
    int szam1;
    int szam2;
    int szam3;
    int szam4;
    int tomb1[][] = new int[2][2];
    int tomb2[][] = new int[2][2];
   
    System.out.println("Kérem az első mátrix elemeit:");
    for (szam1 = 0; szam1 < tomb1.length; szam1++){
        for (szam2 = 0; szam2 < tomb1.length; szam2++){
        tomb1[szam1][szam2] = sc.nextInt();
    } }
    System.out.println("Kérem a második mátrix elemeit:");
    for (szam3 = 0; szam3 < tomb2.length; szam3++){
        for (szam4 = 0; szam4 < tomb2.length; szam4++){
        tomb2[szam3][szam4] = sc.nextInt();
    } }
    int[][] tomb3 = new int [2][2];
    tomb3[0][0] = tomb1[0][0]+tomb2[0][0];
    tomb3[0][1] = tomb1[0][1]+tomb2[0][1];
    tomb3[1][0] = tomb1[1][0]+tomb2[1][0];
    tomb3[1][1] = tomb1[1][1]+tomb2[1][1];
    
     System.out.println("Az eredmény:");
     for (int i = 0; i < tomb3.length; i++){
         for (int j = 0; j < tomb3[i].length; j++)
           System.out.print(tomb3[i][j]+" ");
           System.out.println();
    }
    }
}



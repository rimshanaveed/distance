/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter distance");
        double t,d,s;
        d=scan.nextFloat();
        System.out.print("enter speed");
        s=scan.nextFloat();
        t=d/s;
        System.out.print("time is:"+t);
    }
    
}

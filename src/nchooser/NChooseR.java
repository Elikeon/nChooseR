/*
 * Jared Craig
 * 24/10/2018
 */

package nchooser;

import javax.swing.JOptionPane;

/**
 *
 * @author jacra1226
 */
public class NChooseR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String listing = "";
        int n, r, numways;
        String n2,r2;
 r2 = JOptionPane.showInputDialog("This program will calculate the number of ways \nto choose r different objects from a set of n objects."
         + "\nHow many objects would you like to choose?"); 
 n2 = JOptionPane.showInputDialog("How many objects are there to choose fro?"); 
        r = Integer.parseInt(r2);
        n = Integer.parseInt(n2);

        numways = factorial(n)/(factorial(r)*factorial(n-r));

        listing = "There are " + numways + " ways.";
        System.out.println(listing);
    }                                         

    static public int factorial (int n) {
        if (n==1 || n==0) {
            return 1;
        } else {
            return (n*factorial(n-1));
        }
    }

}

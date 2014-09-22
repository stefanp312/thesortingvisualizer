/*
Stefan Pleava
Humberview SS
07/05/2014
ICS4UO
Sorting Project
A program that showcases the various sorting algorithms with various data types and different amounts of data 
*/
package finalProject;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Stefan
 */
public class programInterface extends JFrame {
    
    private static String[] args;

    public static void main(String[] args) {
        //creates a new password field object and a label that also attachs
        // them to a box which will be displayed on a joption pane
        JPasswordField jpf = new JPasswordField(24);
        JLabel jl = new JLabel("Please enter the password provided in the manual. ");
        Box box = Box.createHorizontalBox();
        box.add(jl);
        box.add(jpf);
        
        //continue a loop as long as the password isn't entered
        while(checkPass(String.valueOf(jpf.getPassword()))==false){  
            JOptionPane.showConfirmDialog(null, box, "Name Entry", JOptionPane.PLAIN_MESSAGE);
        }
        mainMenu();
        

    }

    public static void mainMenu() {
        //open the main class
        mainScreen.main(args);
    }

    public static void sortingScreen() {

    }

    public static boolean checkPass(String s) {
        //returns true if pass is good otherwise false
        return s.equals("thesortingvisualizer2014");
    }
}

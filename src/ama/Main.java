/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ama;

/**
 *
 * @author kerem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static FormMain formMain;
    
    public static void main(String[] args) {
        formMain = new FormMain();
        formMain.setVisible(true);
        formMain.setTitle("ABAP Modification Assistant - by Kerem Koseoglu");
    }

}

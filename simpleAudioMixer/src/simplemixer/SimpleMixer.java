/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemixer;

import javax.swing.JFrame;
import kuusisto.tinysound.TinySound;


/**
 *
 * @author maj
 */
public class SimpleMixer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TinySound soundSystem = new TinySound();
        //soundSystem.init();
        TinySound.init();
        
        try {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {
            e.printStackTrace();
            java.lang.System.exit(1);
        }
        
    }
    
}

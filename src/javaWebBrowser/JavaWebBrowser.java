/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaWebBrowser;

import javax.swing.JFrame;

/**
 *
 * @author ayofo
 */
public class JavaWebBrowser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoadPageToScreen myScreen = new LoadPageToScreen();
        myScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

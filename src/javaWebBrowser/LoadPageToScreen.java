/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaWebBrowser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author ayofo
 */
public class LoadPageToScreen extends JFrame{
    private JTextField addressBar;
    private JEditorPane window;

    //Constructor
    public LoadPageToScreen() {
        super("Browser 2k18");
        
        addressBar = new JTextField("Enter a URL!");
        addressBar.addActionListener( //anonymous inner class
            new ActionListener(){
                public void actionPerformed(ActionEvent event){ //this  method is call whenever the use presses enter
                    loadPage(event.getActionCommand()); //will collect string from the address bar and pass it into the loadPage method
                }
            }
        );
        add(addressBar, BorderLayout.NORTH);//address bar will appear at th top of the screen
        
        window = new JEditorPane();
        window.setEditable(false); //stops the user from editing the window
        window.addHyperlinkListener( //when links are clicked on the page it will be passed into the load page method
            new HyperlinkListener(){
                public void hyperlinkUpdate(HyperlinkEvent event){ //method will be called when user clicks hyperlink
                    if(event.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
                        loadPage(event.getURL().toString()); //goes to the link's page
                    }
                }
            }
        );
        add(new JScrollPane(window), BorderLayout.CENTER);
        setSize(1366, 768);
        setVisible(true);
    }     
    
    private void loadPage(String websiteURL){
        try{
            window.setPage(websiteURL);
            addressBar.setText(websiteURL);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Incorrect URL!");
        }
    }
}

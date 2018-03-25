/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifteenpuzzle;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Puja Kumari
 */
public class P1 extends JApplet {

    JPanel p,p2,p3;
    JButton b1,b2,b3;
    int i,j;
    public void init() {
        // TODO start asynchronous download of heavy resources
        ImageIcon img =new ImageIcon("C://Users/Puja Kumari/Downloads/background.jpg");
        p=new JPanel();
        p2= new JPanel();
        p3= new JPanel();
        b1=new JButton("NEW GAME",img);
        b2=new JButton("INSTRUCTIONS",img);
        b3=new JButton("EXIT",img);
        
        //Buttons
        Border thickBorder = new LineBorder(Color.WHITE, 3);     
       
        b1.setPreferredSize(new Dimension(200, 50));
        b2.setPreferredSize(new Dimension(200, 50));
        b3.setPreferredSize(new Dimension(200, 50));
        
        b1.setBorder(thickBorder);
        b2.setBorder(thickBorder);
        b3.setBorder(thickBorder);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
        b1.setHorizontalTextPosition(SwingConstants.CENTER);
        b2.setHorizontalTextPosition(SwingConstants.CENTER);
        b3.setHorizontalTextPosition(SwingConstants.CENTER);
        //buttons end
        
        //panels and layouts
        p.setLayout(new GridLayout(1,2));
        p2.setLayout(new FlowLayout());
        p3.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.insets = new Insets(20, 0, 20, 0);
        gbc.fill=GridBagConstraints.VERTICAL;
        gbc.gridx=0;
        gbc.gridy=0;
        p3.add(b1,gbc);
        gbc.fill=GridBagConstraints.VERTICAL;
        gbc.gridx=0;
        gbc.gridy=2;
        p3.add(b2,gbc);
        gbc.fill=GridBagConstraints.VERTICAL;
        gbc.gridx=0;
        gbc.gridy=4;
        
        p3.add(b3,gbc);
        p.add(p2);
        p.add(p3);
        
        p2.repaint();
        
        setContentPane(p);
        setSize(1680,1050);

    }
    public P1(){
        
        
    }
    
    public void paint(Graphics g) {

        ImageIcon i = new ImageIcon("C://Users/Puja Kumari/Downloads/grid.jpg");
        ImageIcon img1 =new ImageIcon("C://Users/Puja Kumari/Downloads/15 puzzle.jpg");
        g.drawImage(i.getImage(), 0,0, this);
        g.drawImage(img1.getImage(), 0,200, p2);
        
    }
    // TODO overwrite start(), stop() and destroy() methods
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafik;

import java.awt.Graphics;
/**
 *
 * @author Hamid
 */
public class MyOval extends java.applet.Applet {
    public void paint(Graphics g){
        g.drawOval(20, 20, 60, 60);
        //g.fillOval(120, 20, 100, 60);
        
        //g.drawArc(20, 100, 60, 60, 90, 180);
        
        //g.drawRect(20, 160, 60, 60);
        //g.fillArc(20, 160, 60, 60, 25, 90);
        
        
    }
}

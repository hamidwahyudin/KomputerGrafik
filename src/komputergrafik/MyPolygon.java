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
public class MyPolygon extends java.applet.Applet {
    public void paint(Graphics g){
        //polygon
        int exes[] = { 39, 94, 97, 142, 53, 58, 26 }; //titik x
        int whys[] = { 33, 74, 36, 70, 108, 80, 106}; //titik y
        int pts = exes.length;
        g.drawPolygon(exes, whys, pts);
        
        
        int exes2[] = { 100, 70, 80, 60, 140, 120, 130};
        int whys2[] = { 110, 160, 160, 210, 210, 160, 160};
        int pts2 = exes2.length;
        g.drawPolygon(exes2, whys2, pts2);
        
    }
}

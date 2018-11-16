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
public class MyLine extends java.applet.Applet {
    public void paint(Graphics g){
        //garis
        //parameter (x awal, y awal, x akhir, y akhir)
        g.drawLine(25, 25, 75, 25); //panjang garis 75-20 = 50 (x2-x1)
        g.drawLine(100, 0, 100, 50); //panjang garis 50-0 = 50 (y2-y1)
        
        //kotak manual
        g.drawLine(25, 50, 25, 100); // |
        g.drawLine(25, 50, 75, 50); // -
        g.drawLine(25, 100, 75, 100); // -
        g.drawLine(75, 50, 75, 100); // |
        
        //Rectangle , kotak
        //parameter (x, y, lebar, tinggi)
        g.drawRect(25, 125, 50, 50);
        
        //Rectangle , kotak dengan warna
        //parameter (x, y, lebar, tinggi)
        g.fillRect(100, 125, 50, 50);        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafik;

import java.awt.Graphics;
import java.awt.Font;
/**
 *
 * @author Hamid
 */
public class Uts1 extends java.applet.Applet {
    public void paint(Graphics g){
        //gabungan line , rectangle, text
        g.drawRect(20, 30, 100, 50);
        
        //garis segitiga atas
        g.drawLine(20, 30, 70, 5);
        g.drawLine(70, 5, 120, 30);
        
        //garis segitiga bawah
        g.drawLine(20, 80, 70, 110);
        g.drawLine(70, 110, 120, 80);
        
        //text
        Font nama = new Font("TimesRoman", Font.PLAIN, 12);
        g.setFont(nama);
        g.drawString("Hamid Wahyudin", 28, 60);
    }
}

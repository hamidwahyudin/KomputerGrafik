/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafik;

import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Hamid
 */
public class Uts2 extends java.applet.Applet {
    public void paint(Graphics g){
        //polygon biru
        int exes[] = { 0, 0, 600, 600, 300}; //titik x
        int whys[] = { 300, 0, 0, 300, 600}; //titik y
        int pts = exes.length;
        g.setColor(Color.blue);
        g.fillPolygon(exes, whys, pts);
        
        //polygon hijau
        int exes_hijau[] = { 100, 100, 500, 500, 300}; //titik x
        int whys_hijau[] = { 300, 100, 100, 300, 500}; //titik y
        int pts_hijau = exes_hijau.length;
        g.setColor(Color.green);
        g.fillPolygon(exes_hijau, whys_hijau, pts_hijau);
        
        //polygon hijau
        int exes_kuning[] = { 200, 200, 400, 400, 300}; //titik x
        int whys_kuning[] = { 300, 200, 200, 300, 400}; //titik y
        int pts_kuning = exes_hijau.length;
        g.setColor(Color.yellow);
        g.fillPolygon(exes_kuning, whys_kuning, pts_kuning);
        
        //lingkaran merah
        g.setColor(Color.red);
        g.fillOval(250, 230, 100, 100);
    }
}

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
public class PapanCatur extends java.applet.Applet {
    public void paint(Graphics g){    
        //papan catur
        //x awal = 25
        // y awal = 25
        int r = 0;
        for(int baris=1; baris <= 8; baris++){ //8 baris
            int j = 0;
            for(int kolom=1; kolom <= 8; kolom++){ //8 kolom
                if(baris%2 == 0){ //baris genap
                    if(kolom%2 == 0){ //kolom genap
                        g.fillRect((25+j), (25+r), 50, 50); //kotak hitam
                    }else{
                        g.drawRect((25+j), (25+r), 50, 50); //kotal
                    }
                }else{ //baris ganjil
                    if(kolom%2 == 0){
                        g.drawRect((25+j), (25+r), 50, 50); //kotak
                    }else{
                        g.fillRect((25+j), (25+r), 50, 50); //kotak hitam
                    }
                }
            j += 50; //lebar kotak
            }
            r += 50; //tinggi kotak
        }       
    }
}

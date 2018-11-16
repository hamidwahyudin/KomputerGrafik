/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafik;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Hamid
 */
public class Uts3 extends JPanel{
    public static void main(String[] args) {
        JFrame f = new JFrame("UTS");
        Uts3 bs = new Uts3();
        f.getContentPane().add("Center", bs);
        f.pack();
        f.setSize(new Dimension(300, 300));
        f.setVisible(true);
    }
    
    public void paintComponent (Graphics g){
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if(i<j){
                    g.drawOval(10+(50*j), 10+(50*i), 50, 50);
                }else if(i==j){
                    g.fillRoundRect(10+(50*j), 10+(50*i), 50, 50, 5, 5);
                }else{
                    g.drawOval(10+(50*j), 10+(50*i), 50, 50);
                }
            }
        }
    }
}

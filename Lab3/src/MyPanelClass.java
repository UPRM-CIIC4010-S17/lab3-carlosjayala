import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        //g.fillRect(x1, y1, width, height);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, height/5, width, height/5);
                        g.fillRect(x1, 3*(height/5), width, height/5);
                        
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(x1, y2);
                        p3.addPoint(width/2, height/2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);

                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(width/10 + 5, height/10 + 73);
                        p2.addPoint(width/10 + 21, height/10 + 73);
                        p2.addPoint(width/10 + 27, height/10 + 58);
                        p2.addPoint(width/10 + 33, height/10 + 73);
                        p2.addPoint(width/10 + 49, height/10 + 73);
                        p2.addPoint(width/10 + 36, height/10 + 83);
                        p2.addPoint(width/10 + 41, height/10 + 98);
                        p2.addPoint(width/10 + 27, height/10 + 88);
                        p2.addPoint(width/10 + 14, height/10 + 98);
                        p2.addPoint(width/10 + 18, height/10 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.fillPolygon(p2);

                        
                        //Draw a border
//                      g.setColor(Color.YELLOW);
//                      g.drawRect(x1, y1, width, height);
//                      g.setColor(Color.RED);
//                      g.drawRect(x1+5, y1+5, width-10, height-10);
//                      
//                      g.setColor(Color.WHITE);
//                      g.drawLine(x1, y1, x2, y2);
//                      g.setColor(Color.BLUE);
//                      g.drawLine(x2, y1, x1, y2);
                      
                     // g.setColor(Color.LIGHT_GRAY);
                    //  g.fillOval(x1, y1, width, height);
                    //  g.fillOval(width/2 -30, height/2 -30, 55, 55);
                      
//                      Polygon p = new Polygon();
//                      p.addPoint(x1 + 5, y1 + 25);
//                      p.addPoint(x1 + 20, y1 + 10);
//                      p.addPoint(x1 + 35, y1 + 25);
//                      p.addPoint(x1 + 25, y1 + 25);
//                      p.addPoint(x1 + 25, y1 + 45);
//                      p.addPoint(x1 + 15, y1 + 45);
//                      p.addPoint(x1 + 15, y1 + 25);
//                      g.setColor(Color.YELLOW);
//                      g.fillPolygon(p);
                        
                        
            }
}
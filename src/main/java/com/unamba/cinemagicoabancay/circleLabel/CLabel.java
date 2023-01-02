package com.unamba.cinemagicoabancay.circleLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.AbstractBorder;
public class CLabel extends JLabel {

   private AbstractBorder circleBorder = new CircleBorder();       
   private int lineBorder=1; 
   private Color lineColor= Color.BLACK;

    /** Constructor */
     public CLabel()
     {
        Dimension d = new Dimension(100,100);
        setSize(d);
        setPreferredSize(d);       
        setText("CLabel");
        setOpaque(true);
        setHorizontalAlignment(CENTER);       
        setVisible(true);       
        setBorder(circleBorder); 
     }
     /* Constructor 2 
        x: dimension en x
        y: dimension en y
        lineThickness: grosor del borde
        colorThickness:color del borde
        pathImage: direccion de la imagen
     */
     public CLabel(int x,int y,int lineThickness,Color colorThickness,String pathImage)
     {
        Dimension d = new Dimension(x,y);
        setSize(d);
        setPreferredSize(d);       
        //setText("CLabel");
        ImageIcon imgIcon = new ImageIcon(pathImage);
        Image imgEscalada = imgIcon.getImage().getScaledInstance(x,y, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        setIcon(iconoEscalado);
        setLineBorder(lineThickness);
        setLineColor(colorThickness);
        setOpaque(true);
        setHorizontalAlignment(CENTER);       
        setVisible(true);       
        setBorder(circleBorder); 
     }
    //Color de borde
    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color color) {
        circleBorder = new CircleBorder(color, lineBorder);
        lineColor = color;
        setBorder(circleBorder); 
    }

    //Grosor de borde
    public int getLineBorder() {
        return lineBorder;        
    }

    public void setLineBorder(int lineBorder) {
        circleBorder = new CircleBorder(lineColor, lineBorder);
        this.lineBorder = lineBorder;        
        setBorder(circleBorder); 
    }
}

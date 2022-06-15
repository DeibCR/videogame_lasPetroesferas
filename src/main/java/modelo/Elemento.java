/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author DEIBER
 */
public class Elemento {
    private ImageIcon imagen;
    private int x, y;
    
    
    public Elemento (ImageIcon imagen, int x, int y){
        this.imagen=imagen;
        this.x=x;
        this.y=y;
    }

    public Elemento(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setImagen (ImageIcon imagen){
        this.imagen=imagen;
    }
    
    public ImageIcon getImagen(){
        return imagen;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void dibujar(Graphics g){
        imagen.paintIcon(null, g, getX(), getY());
    }
    
}

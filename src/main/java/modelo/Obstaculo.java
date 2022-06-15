/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author DEIBER
 */
public class Obstaculo extends Elemento {
    
    private boolean colisiona;

    public Obstaculo(ImageIcon imagen, int x, int y) {
        super(imagen, x, y);
        this.colisiona=colisiona;
    }
    
    public boolean isColisiona(){
        return colisiona;
    }
    
    public void setColisiona(boolean colisiona){
        this.colisiona=colisiona;
    }
    
    
    
}

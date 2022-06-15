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
public class Principal extends Elemento{
    
    private int vidas;
    
    public Principal (ImageIcon imagen, int x, int y, int vidas){
        super(imagen,x, y);
        this.vidas=vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }
    
    
    
    
}

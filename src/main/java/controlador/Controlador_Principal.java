/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUI_Instrucciones;
import vista.GUI_Juego;
import vista.GUI_Principal;
import vista.Panel_Juego;

/**
 *
 * @author DEIBER
 */
public class Controlador_Principal implements ActionListener {
    
    private GUI_Principal gui_Principal;
    private GUI_Instrucciones gui_Instrucciones;
    private GUI_Juego gui_Juego;
    private Panel_Juego panel_Juego;
    private Controlador_Juego controlador_Juego;

    public Controlador_Principal(GUI_Principal gui_Principal){
        this.gui_Principal=gui_Principal;
        gui_Instrucciones=new GUI_Instrucciones();
        gui_Juego= new GUI_Juego();
        panel_Juego=gui_Juego.getPanelJuego();
        controlador_Juego=panel_Juego.getControladorGUIJuego();
        gui_Juego.setControlador(controlador_Juego);
        controlador_Juego.setGUIJuego(gui_Juego);
        
        
    }// fin del constructor
    
    public void actualizar(Graphics g){
    controlador_Juego.dibujar(g);
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
            case "Jugar":
                System.err.println("Este es el evento Jugar");
                panel_Juego.repaint();
                gui_Juego.setVisible(true);
                break;
            case "Instrucciones":
                System.err.println("Este es el evento Instrucciones");
                gui_Instrucciones.setVisible(true);
                break;
            case "Record":
                System.err.println("Este es el evento Record");
                break;    
            case "Salir":
                System.err.println("Este es el evento Salir");
                System.exit(0);
                break;
        
        }
    }// fin del action
    
}// fin de la clase

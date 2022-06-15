/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUI_Instrucciones;

/**
 *
 * @author DEIBER
 */
public class Controlador_Instrucciones implements ActionListener{

    GUI_Instrucciones gui_Instrucciones;
    
    public Controlador_Instrucciones (GUI_Instrucciones gui_Instrucciones){
        this.gui_Instrucciones=gui_Instrucciones;
    }// fin del constructor
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
     switch(e.getActionCommand()){
            case "Volver":
                gui_Instrucciones.setVisible(false);
                break;
        }// fin del case     
        
    }// fin del action
    
}// fin de la clase

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Area_Juego;
import vista.GUI_Juego;
import vista.Panel_Juego;

/**
 *
 * @author DEIBER
 */
public class Hilo_Fondo extends Thread {

    private Area_Juego area_Juego;
    private Panel_Juego panel_Juego;
    private GUI_Juego gui_Juego;
    private Controlador_Juego controlador_Juego;

    public Hilo_Fondo(Area_Juego area_Juego, Panel_Juego panel_Juego, GUI_Juego gui_Juego, Controlador_Juego controlador_Juego) {
        this.area_Juego = area_Juego;
        this.panel_Juego = panel_Juego;
        this.gui_Juego = gui_Juego;
        this.controlador_Juego = controlador_Juego;
    }

    public void run() {
        while (area_Juego.getPersonaje_Principal().getVidas() > 0&&!area_Juego.isGanador()) {
            try {
                area_Juego.moverFondo();
                controlador_Juego.actualizar();
                for(int posicion=0;posicion<area_Juego.getCantidadObstaculos();posicion++){
                 
                
                area_Juego.eliminarObstaculo(posicion);
                if(area_Juego.isColision()){
                    System.out.println("Vidas "+area_Juego.getPersonaje_Principal().getVidas());
                    if(area_Juego.getPersonaje_Principal().getVidas()==0){
                    System.out.println("Fin del juego");
                    }
                }
                }

                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo_Fondo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

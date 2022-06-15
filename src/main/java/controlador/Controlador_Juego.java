/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Area_Juego;
import modelo.Principal;
import vista.GUI_Juego;
import vista.Panel_Juego;

/**
 *
 * @author DEIBER
 */
public class Controlador_Juego implements KeyListener, MouseListener {

    private GUI_Juego gui_Juego;
    private Panel_Juego panel_Juego;
    private Area_Juego area_Juego;
    private Principal personaje_Principal;
    private Hilo_Fondo hilo_Fondo;

    public Controlador_Juego(Panel_Juego panel_Juego) {
        area_Juego = new Area_Juego();
        personaje_Principal = area_Juego.getPersonaje_Principal();
        this.panel_Juego = panel_Juego;
        panel_Juego.setControlador(this);
        hilo_Fondo = new Hilo_Fondo(area_Juego, panel_Juego, gui_Juego, this);
        hilo_Fondo.start();

    }

    public void setGUIJuego(GUI_Juego gui_Juego) {
        this.gui_Juego = gui_Juego;
    }

    public void dibujar(Graphics g) {
        area_Juego.getFondo().dibujar(g);
        personaje_Principal.dibujar(g);

        for (int posicion = 0; posicion < area_Juego.getCantidadObstaculos(); posicion++) {
            area_Juego.getObstaculo(posicion).dibujar(g);
            
        }// muestra los obstaculos en la pila cargados

    }

    public void actualizar() {
        panel_Juego.repaint();
    }

    public void comunicarPerdedor() {
        area_Juego.detener();
        gui_Juego.dispose();
        //guiPerdiste=new GUIPerdiste();

    }

    public void finalizarJuego() {
        area_Juego.detener();
        gui_Juego.dispose();
        System.out.println("Felicidades has llegado a la esfera");
        //GUIPerdiste guiPerdiste=new GUIPerdiste();
        //guiPerdiste.setVisible(true);
    }

    public void subir() {

        personaje_Principal.setY(personaje_Principal.getY() - 20);

    }

    public void moverIzquierda() {
        personaje_Principal.setX(personaje_Principal.getX() - 20);

    }

    public void moverDerecha() {
        personaje_Principal.setX(personaje_Principal.getX() + 20);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.err.println("Este es el evento esc");
            System.exit(0);
        } else {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                System.err.println("Este es el evento Arriba");
                subir();
            } else {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    System.err.println("Este es el evento izq");
                    moverIzquierda();
                } else {
                    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                        System.err.println("Este es el evento der");
                        moverDerecha();
                    }
                }
            }
        }

        panel_Juego.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("X " + e.getX() + "Y " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}

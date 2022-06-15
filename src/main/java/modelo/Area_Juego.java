/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author DEIBER
 */
public class Area_Juego {

    private ArrayList<Obstaculo> obstaculos;
    private Principal personaje_Principal;
    private Elemento fondo;

    public Area_Juego() {
        obstaculos = new ArrayList<Obstaculo>();
        setElementos();

    }

    public Principal getPersonaje_Principal() {
        return personaje_Principal;
    }
    
    public ArrayList<Obstaculo> getObs (){
        return obstaculos;
    }

    public void setElementos() {
        crearPersonajePrincipal();
        crearObstaculos();
        crearFondo();
    }

    public void crearPersonajePrincipal() {
        ImageIcon iPersonajeUp = new ImageIcon("./src/main/resources/imagenes/arriba.gif");
        personaje_Principal = new Principal(iPersonajeUp, 270, 293, 3);

    }

    public void crearObstaculos() {
        ImageIcon IObstaculo = new ImageIcon("./src/main/resources/imagenes/piedra1.png");
        Obstaculo obstaculo1 = new Obstaculo(IObstaculo, 511, 316);
        obstaculos.add(obstaculo1);
        
        
    }

    public void crearFondo() {
        ImageIcon iFondo = new ImageIcon("./src/main/resources/imagenes/fondo.jpg");
        fondo = new Elemento(iFondo, 0, -1340);
    }

    public void moverFondo() {
        fondo.setY(fondo.getY() + 6);
    }

    public Elemento getFondo() {
        return fondo;
    }

    public Obstaculo getObstaculo(int posicion) {
        return obstaculos.get(posicion);
    }
    
    public Obstaculo eliminarObstaculo(int posicion) {
        return obstaculos.remove(posicion);
    }
    

    public int getCantidadObstaculos() {
        return obstaculos.size();
    }

    synchronized public boolean isColision() {
        for (int posicion = 0; posicion < obstaculos.size(); posicion++) {
            if (obstaculos.get(posicion).isColisiona() && (personaje_Principal.getX() >= obstaculos.get(posicion).getX() && personaje_Principal.getX() <= obstaculos.get(posicion).getX() + 70 && personaje_Principal.getY() >= obstaculos.get(posicion).getY() && personaje_Principal.getY() <= obstaculos.get(posicion).getY() + 70)) {
                System.out.println("Posición x del personaje " + personaje_Principal.getX() + "Posición x del obstáculo " + obstaculos.get(posicion).getX() + "Posición Y del personaje " + personaje_Principal.getY() + "Posición y del obstáculo " + obstaculos.get(posicion).getY());
                personaje_Principal.setVidas(personaje_Principal.getVidas() - 1);
                obstaculos.get(posicion).setColisiona(false);
                return true;
            }
        }
        return false;
    }

    public boolean isGanador() {
        if (personaje_Principal.getVidas() > 0 && personaje_Principal.getY() >=400) {
            return true;
        }
        return false;
    }

    public void detener() {
        for (int posicion = 0; posicion < obstaculos.size(); posicion++) {
            obstaculos.get(posicion).setColisiona(false);
        }
    }

    public void felicitarGanador() {
        detener();
    }

}

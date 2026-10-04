/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovideojuego;

import java.util.ArrayList;
import java.util.List;
import logica.VideoJuego;

/**
 *
 * @author glrd4
 */
public class EjercicioVideoJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<VideoJuego> listaVideojuegos = new ArrayList<>();
        
        VideoJuego video1 = new VideoJuego(123, "Banjo Kazooie","Nintendo 64", 4,"Plataforma");
        VideoJuego video2 = new VideoJuego(456, "Mario Party 3","Nintendo 64", 4,"Plataforma");
        VideoJuego video3 = new VideoJuego(789, "Age of Empire II","PC", 1,"Estrategia");
        VideoJuego video4 = new VideoJuego(100, "Counter Strike","PC", 1,"Shooter");
        VideoJuego video5 = new VideoJuego(101, "Mario Kart 64","Nintendo 64", 4,"Plataforma");
        
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        
        for (VideoJuego juegos: listaVideojuegos){
            System.out.println("Titulo: "+ juegos.getTitulo()+"\nConsola: "+juegos.getConsola()+"\nCant Jugadores: "+juegos.getCantJugadores()+"\n");
        }
        System.out.println("=======================================");
        video1.setTitulo("Banjo KAzooie II");
        video1.setCantJugadores(1);
        
        
        video5.setTitulo("Super Mario Kart 64");
        video5.setCantJugadores(4);
        
        for (VideoJuego juegos: listaVideojuegos){
            System.out.println("Titulo: "+ juegos.getTitulo()+"\nConsola: "+juegos.getConsola()+"\nCant Jugadores: "+juegos.getCantJugadores()+"\n");
        }
        
        System.out.println("=======================================");
        for (VideoJuego juegos: listaVideojuegos){
            if (juegos.getConsola().equals("Nintendo 64")){
                System.out.println(juegos.toString());
            }
            
            }
        System.exit(0);
    }
    
}

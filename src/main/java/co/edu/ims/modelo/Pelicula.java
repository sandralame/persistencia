
package co.edu.ims.modelo;

import java.util.List;
import javax.persistence.Id;


public class Pelicula {
@Id 
private Long Id;
private List<Genero> generos;

    
    
    
    
    
    
    
    //ATRIBUTOS
    private String titulo;
    private int anion;
    private String director;
    
    
 
    //CONSTRUCTOR
    public void pelicula (){}


public  Pelicula (String t, int a, String d){
    
    titulo=t;
    anion=a;
    director=d;
       
    
    
}

public  Pelicula (String t){
    
    titulo=t;
    anion=1;
    director="desconocido";
}

//metodos
public String mostrarDatos(){
    return "titulo:" + titulo + "aÃ±o:" + anion + "director: "+ director;
}



//getters y setters
    public String getTitulo() {
        return titulo;
    }

    public int getAnion() {
        return anion;
    }

    public String getDirector() {
        return director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnion(int anion) {
        this.anion = anion;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}



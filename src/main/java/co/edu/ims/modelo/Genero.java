
package co.edu.ims.modelo;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Genero implements Serializable {
     //ATRIBUTOS
   
    @Id
    private String tipo;
    private int duracion;
    private String trama ;
   
    //CONSTRUCTOR    
    public  Genero() {}
    
    public  Genero (String tp, int du, String tr) {        
        tipo =tp;
        duracion = du;
        trama = tr; 
        
        }
       
    public  Genero (String tp){    
    tipo=tp;
    duracion=7;
    trama="desconocido";    
  }     
    //metodos
    public String mostrar3Datos(){
        return "tipo:" + tipo + "duracion :" + duracion + "trama: "+ trama;
      
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }
 
    
    
}
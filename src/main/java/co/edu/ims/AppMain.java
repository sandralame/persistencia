
package co.edu.ims;

import co.edu.ims.modelo.Director2;
import co.edu.ims.modelo.Genero;
import co.edu.ims.modelo.Pelicula;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class AppMain {
    
    public static void main (String[]args){
  EntityManagerFactory emf;
        EntityManager em; 
        
        emf = Persistence.createEntityManagerFactory("peliculasPU");        
        em = emf.createEntityManager();
        
        // Se crea objeto en memoria (sin persistir aun).
        Genero accion = new Genero("Accion", 5 ,"Peliculas de accion");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(accion); // Se persiste objeto en base de datos.
        tx.commit();
        
        
    }
    
    public static void prueba1(){
                //Objetos
        
        Pelicula intensamente = new Pelicula("Intensamente :", 2014, "Pixard"); 
                                               //constructores//
        Pelicula terminator = new Pelicula("Terminator :");
        
       String Resultado = intensamente.mostrarDatos();
       System.out.println(Resultado);
        
       String Resultado2 = terminator.mostrarDatos();
       System.out.println(Resultado2);
       
        //-------------------------------------------------------------------------------
       Director2 dramatico =new Director2 ("dramatico ", 1, "Diana Campo");
       Director2 ficcion =new Director2 ("ficcion ", 3, "roger");
       
       String ResultadoD = dramatico.mostrar2Datos();
       System.out.println(ResultadoD);
       
       String ResultadoD2 = ficcion.mostrar2Datos();
       System.out.println(ResultadoD2);
       
       //---------------------------------------------------------------------------
       
        Genero CineMatografico =new Genero ("CineMatografico :", 8, " de la madurez: ");
       Genero epico=new Genero ("epico:  ", 9, "desilucion: ");
       
       String ResultadoT = dramatico.mostrar2Datos();
       System.out.println(ResultadoT);
       
       String ResultadoT2 = ficcion.mostrar2Datos();
       System.out.println(ResultadoT2);
       
       
       //-----------------------------------------------------------
       
       
        
    }
}

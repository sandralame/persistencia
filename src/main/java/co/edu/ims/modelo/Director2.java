
package co.edu.ims.modelo;


public class Director2 {
    
    
    //ATRIBUTOS
    private String guion;
    private int tiempo;
    private String autor;
    
    //CONSTRUCTOR
    
    public void Director2() {}
    
    public  Director2 (String g, int ti, String au) {
        
        guion =g;
        tiempo = ti;
        autor = au; 
        
        
              
    }
       
    public  Director2 (String g){
    
    guion =g;
    tiempo=1;
    autor="desconocido";
    
    
}
    //metodos
public String mostrar2Datos(){
    return "guion:" + guion + "tiempo:" + tiempo + "autor: "+ autor;
}

    public String getGuion() {
        return guion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public String getAutor() {
        return autor;
    }

    public void setGuion(String guion) {
        this.guion = guion;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
       }     
            
            
    
            
    


package controlador;

import modelo.Curso;
import modelo.Formulario;
import modelo.Proponente;
import modelo.Usuario;


//Clase encargada del control de los proponente

public class Proponente_Control {
    private static Proponente_Control PC;
    Proponente P1;

    private Proponente_Control()
    {}

    public static Proponente_Control getinstancia()
    {
        if (PC==null) {
            PC=new Proponente_Control();
        }
        return PC;
    }
    
    public boolean verificiacion(String user,String password){
        
        BD_Control c=BD_Control.getinstancia();
        P1 = c.buscarP(user, password);
           if(P1 == null){
           return false;    
           }
           
           return true;
    }
    
    


}

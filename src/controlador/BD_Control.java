package controlador;
import java.lang.reflect.Array;
import java.util.ArrayList;

import modelo.Usuario;
import modelo.Administrador;
import modelo.Dato;
import modelo.Proponente;

import java.io.Serializable;



//Esta clase se va a encargar de Controlar de las operaciones que están relacionadas con la gestión básica de la “base de dato” 
//en la lógica 

public class BD_Control implements Serializable {  
    
    private static BD_Control instancia;

    private Dato D;
    //private ArrayList<administradore> Usuarios= new ArrayList<Object>();

    private static String Ruta = "Datos.txt";
                                                                    
    private BD_Control()
    {
        D=new Dato();
        
    }
    public static BD_Control getinstancia()
    {
        if (instancia==null) {
            instancia=new BD_Control();
        }
        return instancia;
    }

    public void agregarP(Proponente P)
    {
        D.agregarP(P);
    }
    public void agregarA(Administrador A)
    {
        D.agregarA(A);
    }
    

    public void mostrarP()
    {
        D.mostrar();
        
    }


    public Proponente buscarP(String user,String password){

        ArrayList<Proponente> Proponentes = D.getProponentes();
        
        for(Proponente p : Proponentes){
        if(user.equals(p.getUser()) && password.equals(p.getPassword())){
            
        return p;
            
        }
            
        }
        
    return null;
    
 
    }


 
     public void guardarTxt()
    {  
        Control_Archivo.serializarObjeto(Ruta, D);
    }

    public void cargarTxt()
    {
        Dato Datotm=new Dato();

        Datotm=Control_Archivo.deserializarObjeto(Ruta, Dato.class);  //esta funcion se encarga de sacar los datos del archivo y guardaros en la lista en la logica
        if (Datotm==null) 
        {
            System.out.println("vasio crear nueva carpeta");
        }
        else
        {
            D=Datotm;
        }
    }



}

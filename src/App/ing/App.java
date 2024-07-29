package App.ing;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import controlador.BD_Control;
import controlador.Control_Archivo;
import controlador.Proponente_Control;
import controlador.Registrarse;
import modelo.Administrador;
import modelo.Proponente;
import modelo.Usuario;











public class App {
    public static void main(String[] args) {

        Proponente p1 =new Proponente("juan", "123", "2615", "link", "link2", "link", "link3", "link4");
        Proponente p2 =new Proponente("luis", "123", "2615", "link", "link2", "link", "link3", "link4");
        Proponente p3 =new Proponente("manuel", "123", "2615", "link", "link2", "link", "link3", "link4");
        Administrador a1=new Administrador("Carlos", "456", "ciencia");

        //BD_Control c=BD_Control.getinstancia();
        //c.cargarTxt();

        Registrarse.Registrar_Proponente(p1);

        p1.mostrar();

        
        

       // Proponente_Control p=Proponente_Control.getinstancia();

        //System.out.println(p.verificiacion("juan", "124"));

        //c.guardarTxt();
    
        //c.mostrarP();
        
        
        

       
        
        
    
    }

}

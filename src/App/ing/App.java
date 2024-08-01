package App.ing;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

import controlador.Admin_Control;
import controlador.BD_Control;
import controlador.Control_Archivo;
import controlador.Proponente_Control;
import controlador.Registrarse;
import modelo.Administrador;
import modelo.Curso;
import modelo.Formulario;
import modelo.Proponente;
import modelo.Usuario;











public class App {
    public static void main(String[] args) {

        Proponente p1 =new Proponente("juan", "123", "2615", "link", "link2", "link", "link3", "link4");
        Proponente p2 =new Proponente("luis", "123", "2615", "link", "link2", "link", "link3", "link4");
        Proponente p3 =new Proponente("manuel", "123", "2615", "link", "link2", "link", "link3", "link4");

        

        Formulario F=new Formulario("Mixto", null, null, null, null, null, null, null, null, null, null);
        //Administrador J=new Administrador("Juan", "123", "Deu");
        //Administrador M=new Administrador("Mateo", "123", "Deu");
        //Administrador L=new Administrador("Luis", "123", "Deu");
        

        BD_Control c=BD_Control.getinstancia();
        //c.cargarTxt();
        //c.agregarA(J);
        //c.agregarA(M);
        //c.agregarA(L);

        Proponente_Control p=Proponente_Control.getinstancia();
        Admin_Control A=Admin_Control.getinstancia();

        //Registrarse.Registrar("Carlos","123","Ciencia");


        System.out.println(A.verificacion("Juan", "123"));
        


        p1.mostrar();

        //p.Proponer_Curso(F);
        //p.Ver_Curso();

        
        

        //System.out.println(p.verificiacion("juan", "124"));

        c.guardarTxt();
    
        c.mostrarP();
    
           
    
    }

}

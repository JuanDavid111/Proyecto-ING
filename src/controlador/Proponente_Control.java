package controlador;

import java.lang.reflect.Array;
import java.util.ArrayList;

import modelo.Curso;
import modelo.Formulario;
import modelo.Proponente;



//Clase encargada del control del proponente asi como lo que el puede hacer

public class Proponente_Control {
    private static Proponente_Control PC;
    Proponente P1;

    private Proponente_Control()
    {}

    public static Proponente_Control getinstancia() // se uso el patrol de diseño singleton
    {
        if (PC==null) {
            PC=new Proponente_Control();
        }
        return PC;
    }
    
    public boolean verificacion(String user,String password){
        
        BD_Control c=BD_Control.getinstancia();
        P1 = c.buscarP(user, password);
           if(P1 == null){
           return false;    
           }
           
           return true;
    }


    public void Proponer_Curso(Formulario F)
    {
        Curso c=new Curso();
        c.setFormulario(F);
        P1.agregarCurso(c);
        BD_Control session=BD_Control.getinstancia();
        session.guardarTxt();
    }

    public void Ver_Curso()
    {
    ArrayList<Curso> Cursos;
    Cursos=P1.getCursos();

    for(Curso c:Cursos)
    {
        String D=c.getFormulario().getDenominacion();
        System.out.println(D);

    }
        

    }
    public Proponente getProponente(){
        return P1;
    }
    


}

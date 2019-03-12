/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Liz Jimenez
 */
public class Registros {
    static String nombre, apM,apP,usuario, contra;
    String cel;

    public Registros() {
    }

    public Registros(String nombre, String apM, String apP, String usuario, String contra, String cel) {
        this.nombre = nombre;
        this.apM = apM;
        this.apP = apP;
        this.usuario = usuario;
        this.contra = contra;
        this.cel = cel;
    }

    public Registros(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Registros.usuario = usuario;
    }

    public static String getContra() {
        return contra;
    }

    public static void setContra(String contra) {
        Registros.contra = contra;
    }

    
    
    
    public void registrar(){
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="insert into usuario values(null,'"+nombre+"','"+apP+"','"+apM+"','"+cel+"','"+usuario+"','"+contra+"');";
            sentencia.execute(sql);
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    
    public String iniciarS(){
        consultar();
        String a="";
        if (prueba==null) {
            a="no";
        }if(prueba!=null){
            a="si";
        }
        return a;
    }
    
    String prueba;
    private void consultar() {
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="select nombre from usuario where usuario='"+usuario+"' and password='"+contra+"';";
            ResultSet registro=sentencia.executeQuery(sql);
            while(registro.next()){
                prueba=registro.getString(1);
            }
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    
}

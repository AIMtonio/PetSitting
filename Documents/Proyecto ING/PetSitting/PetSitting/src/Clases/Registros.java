/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Liz Jimenez
 */
public class Registros {
    static String nombre,apP,usuario, contra;
    String cel;
    
    String nomM,tipo,raza;
    int edad;
    double peso;

    public Registros(String nomM, String tipo, String raza, int edad, double peso) {
        this.nomM = nomM;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }
    public Registros() {
    }

    public Registros(String nombre, String apP, String usuario, String contra, String cel) {
        this.nombre = nombre;
        
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
            String sql="insert into usuario values(null,'"+nombre+"','"+apP+"','"+cel+"','"+usuario+"','"+contra+"');";
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
    
    public String prueba;
    public void consultar() {
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
    
    public String pruebar;
    public void consultarr() {
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="select id_usuario from usuario;";
            ResultSet registro=sentencia.executeQuery(sql);
            while(registro.next()){
                pruebar=registro.getString(1);
            }
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    
     public String p;
    public void consultarm() {
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="select id_mascota from mascota;";
            ResultSet registro=sentencia.executeQuery(sql);
            while(registro.next()){
                p=registro.getString(1);
            }
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    
    public void registrarmascota(){
        registrarcontrol();
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="insert into mascota values(null,'"+nomM+"','"+edad+"','"+peso+"','"+raza+"',now(),'"+tipo+"',1,1);";
            sentencia.execute(sql);
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    public void registrarcontrol(){
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="insert into control values(null,'1.300',3,3)";
            sentencia.execute(sql);
        }catch(Exception a){
            a.printStackTrace();
        }
    }
   
    
}

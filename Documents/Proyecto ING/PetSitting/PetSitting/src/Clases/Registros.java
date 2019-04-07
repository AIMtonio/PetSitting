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
    static String nombre,apP,usuario, contra, correo;
    String cel;
    
    String nomM,tipo,raza, enfermedad;
    double peso, edad;

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Registros(String nomM, String tipo, String raza, double edad, double peso,String enfermedad) {
        this.nomM = nomM;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
    }
    
    public Registros() {
    }

    public Registros(String nombre, String apP, String usuario, String contra, String cel, String correo) {
        this.nombre = nombre;
        this.apP = apP;
        this.usuario = usuario;
        this.contra = contra;
        this.cel = cel;
        this.correo = correo;
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
            String sql="insert into usuario values(null,'"+nombre+"','"+apP+"','"+cel+"','"+correo+"','"+usuario+"','"+contra+"');";
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Registro exitoso");
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
            String sql="insert into mascota values(null,'"+nomM+"','"+edad+"','"+peso+"','"+raza+"','"+enfermedad+"',now(),'"+tipo+"',1,1);";
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Producto activado, se registro tu mascota");
            calcularAlimento(tipo, raza, peso, edad, enfermedad);
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
    String buscarmas;
    public void consultarMascota(){
        try{
        buscarmas=JOptionPane.showInputDialog(null,"Ingresa el nombre de tu mascota","Buscar mascota",JOptionPane.QUESTION_MESSAGE);
        if(buscarmas==null){
            
        }else{
        Conexion obj= new Conexion();
        Statement sentencia=obj.getCon().createStatement();
            System.out.println(buscarmas);
        String sql="select * from mascota where nombre='"+buscarmas+"';";
        ResultSet registro=sentencia.executeQuery(sql);
        while(registro.next()){
            nomM=registro.getString(2);
            edad=registro.getDouble(3);
            peso=registro.getDouble(4);
            raza=registro.getString(5);
            enfermedad=registro.getString(6);
            tipo=registro.getString(8);
        }
        }
        }catch(Exception a){
            a.printStackTrace();
            JOptionPane.showInputDialog(null,"No se encontro a la mascota con ese nombre");
        }
        
    }
    
    public void modificarmascota(){
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="update mascota set nombre='"+nomM+"',"
                    + "edad='"+edad+"',"
                    + "peso='"+peso+"',"
                    + "raza='"+raza+"',"
                    + "enfermedad='"+enfermedad+"',"
                    + "tipo_masc='"+tipo+"'"
                    + "where nombre='"+nomM+"';";
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null,"Los datos de tu mascota se a modificado");
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    
    public void calcularAlimento(String tipo, String raza, double peso, double edad, String enfermedad){
        if(tipo.equals("Perro")){
            if(enfermedad.equals("Obesidad")){
                
            }else if(enfermedad.equals("Desnutricion")){
                
            }else{
                
            }
        }else if(tipo.equals("Gato")){
            if(enfermedad.equals("Obesidad")){
                
            }else if(enfermedad.equals("Desnutricion")){
                
            }else{
                
            }
        }else if(tipo.equals("Conejo")){
            if(enfermedad.equals("Obesidad")){
                
            }else if(enfermedad.equals("Desnutricion")){
                
            }else{
                
            }
        }else if(tipo.equals("Roedor")){
            if(enfermedad.equals("Obesidad")){
                
            }else if(enfermedad.equals("Desnutricion")){
                
            }else{
                
            }
        }
    }
}

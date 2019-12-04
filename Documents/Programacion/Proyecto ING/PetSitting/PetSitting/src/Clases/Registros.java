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
    static String nombre,apP,usuario, contra, correo, id;
    String cel, nomM, tipo, raza, enfermedad, actividad, buscarmas;
    double peso, edad, alimento;
    public String pruebar;
    public String prueba;
    public String p;
    
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
    
    public Registros(String nomM, String tipo, String raza, double edad, double peso,String enfermedad, String actividad) {
        this.nomM = nomM;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.actividad = actividad;
    }
    
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

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void registrarUsuario(){
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
        consultarNombreUsuario();
        String a="";
        if (prueba==null) {
            a="no";
        }if(prueba!=null){
            a="si";
        }
        return a;
    }
   
    public void consultarNombreUsuario() {
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
    
    public void consultarIDusuario() {
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
    
    public void consultarIDmascota() {
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
    
    public void registrarMascota(){
        calcularAlimento(tipo, raza, peso, edad, enfermedad);
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="insert into mascota values(null,'"+nomM+"','"+edad+"','"+peso+"','"+raza+"','"+enfermedad+"','"+actividad+"',now(),'"+tipo+"',1,1);";
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null, "Producto activado, se registro tu mascota");
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    
    public void registrarControl(double ca, int ch, int cv){
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="INSERT INTO control VALUES(null,'"+alimento+"','"+ch+"','"+cv+"')";
            sentencia.execute(sql);
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    
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
            enfermedad=registro.getString(6);
            tipo=registro.getString(9);
            raza=registro.getString(5);
            actividad=registro.getString(7);
        }
        }
        }catch(Exception a){
            a.printStackTrace();
            JOptionPane.showInputDialog(null,"No se encontró a la mascota con ese nombre");
        }
        
    }
    
    public void modificarMascota(){
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="update mascota set nombre='"+nomM+"',"
                    + "edad='"+edad+"',"
                    + "peso='"+peso+"',"
                    + "raza='"+raza+"',"
                    + "enfermedad='"+enfermedad+"',"
                    + "tipo_masc='"+tipo+"'"
                    + "where id_mascota='"+p+"';";
            sentencia.execute(sql);
            JOptionPane.showMessageDialog(null,"Los datos de tu mascota se a modificado");
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    
    public void calcularAlimento(String tipo, String raza, double peso, double edad, String enfermedad){
        peso=peso*1000;
        if(tipo.equals("Perro")){
            if(actividad.equals("Alta")){
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-10;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+10;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }
            }else if(actividad.equals("Baja")){
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-15;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+10;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }
            }else{
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-5;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025);
                    registrarControl(alimento, 10, 2);
                }
            }
        }else if(tipo.equals("Gato")){
            if(actividad.equals("Alta")){
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-10;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+10;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }
            }else if(actividad.equals("Baja")){
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-15;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+10;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }
            }else{
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-5;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025);
                    registrarControl(alimento, 10, 2);
                }
            }

        }else if(tipo.equals("Conejo")){
            if(actividad.equals("Alta")){
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-10;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+10;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }
            }else if(actividad.equals("Baja")){
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-15;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+10;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }
            }else{
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-5;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025);
                    registrarControl(alimento, 10, 2);
                }
            }
        
        }else if(tipo.equals("Roedor")){
            if(actividad.equals("Alta")){
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-10;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+10;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }
            }else if(actividad.equals("Baja")){
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-15;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+10;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }
            }else{
                if(enfermedad.equals("Obesidad")){
                    alimento=(peso*0.025)-5;
                    registrarControl(alimento, 10, 2);
                }else if(enfermedad.equals("Desnutricion")){
                    alimento=(peso*0.025)+5;
                    registrarControl(alimento, 10, 2);
                }else{
                    alimento=(peso*0.025);
                    registrarControl(alimento, 10, 2);
                }
            }
        

        }
    }
    
}//class

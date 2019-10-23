/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author lario
 */
public class Email {
    
    private String correo="";
    private String password="";
    private String usuario="";
    private String de="pet_sitting_bs@outlook.com";//"blueskypetsitting546@gmail.com";
    private String clave="Bluesky546";
    public boolean enviado = false;
    
    public Email(String dato){
        correo=dato;
    }
    
    public boolean consultar() {
        try{
            Conexion obj= new Conexion();
            Statement sentencia=obj.getCon().createStatement();
            String sql="SELECT password,usuario FROM usuario WHERE correo='"+correo+"';";
            ResultSet registro=sentencia.executeQuery(sql);
            while(registro.next()){
                password=registro.getString(1);
                usuario=registro.getString(2);
            }
            if(!usuario.equals("")){
                enviarCorreo(correo,"Hola usuario "+usuario+" su contraseña es: "+password+"."
                    +" \n\n\n\n\nEl siguiente mensaje fue creado automaticamente, favor de no responder."
                    ,"Recuperación de contrseña");
                return true;
            }
        }catch(Exception a){
            a.printStackTrace();
        }
        return false;
    }
    
    public boolean enviarCorreo(String para, String mensaje, String asunto){
       
            try{
                //String host = "smtp.gmail.com";
                String host = "smtp-mail.outlook.com";
                
                Properties prop = System.getProperties();
                
                prop.put("mail.smtp.starttls.enable","true");
                prop.put("mail.smtp.host", host);
                prop.put("mail.smtp.user",de);
                prop.put("mail.smtp.password", clave);
                prop.put("mail.smtp.port",587);
                prop.put("mail.smtp.auth","true");
                
                Session sesion = Session.getDefaultInstance(prop,null);
                
                MimeMessage message = new MimeMessage(sesion);
                
                message.setFrom(new InternetAddress(de));
                
                /*
                    
                    NOTA: para enviar correo electronico masivo
                
                    InternetAddress[] direcciones = new InternetAddress[para.length];
                    for(int i=0;i<para.length;i++){
                        direcciones[i] = new InternetAddress(para[i]);
                    }
                
                    for(int i=0;i<direcciones.length;i++){
                        message.addRecipient(Message.RecipientType.TO, direcciones[i]);
                    }
                
                */
                
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(para));
                
                message.setSubject(asunto);
                message.setText(mensaje);
                
                Transport transport = sesion.getTransport("smtp");
                
                transport.connect(host,de,clave);
                
                transport.sendMessage(message, message.getAllRecipients());
                
                transport.close();
                
                enviado = true;
                
            }catch(Exception e){
                e.printStackTrace();
            }
        
        return enviado;
    }
    
//    public static void main(String[] args) {
//        Email e=new Email("larioskay540@gmail.com");
//        if(e.consultar()){
//            if(e.enviado){
//                System.out.println("Se a enviado un correo con su contraseña, favor de revisar su buzón.");
//            }else{
//                System.out.println("No se envió el correo, favor de revisar su conexión.");
//            }
//        }else{
//            System.out.println("No se encontro el correo, favor de revisar los datos.");
//        }
//    }
}

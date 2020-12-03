
package reto5.crudb.Modelos;

import java.util.Date;

public class Usuario {

private String idalias;
private String nombres;
private String apellidos;
private String email;
private String celular;
private String password;


    public Usuario(String id_alias, String nombres, String apellidos, String email, String celular, String password) {
        this.idalias = id_alias;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.celular = celular;
        this.password = password;
        
    }

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public String getId_alias() {
        return idalias;
    }

    public void setId_alias(String id_alias) {
        this.idalias = id_alias;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    


    
}

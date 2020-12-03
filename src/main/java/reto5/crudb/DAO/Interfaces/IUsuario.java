
package reto5.crudb.DAO.Interfaces;

import reto5.crudb.Modelos.Usuario;


public interface IUsuario {
    public boolean agregarUsuario(Usuario u);
    public String eliminarUsuario(String idalias);
    public boolean actualizarUsuario(String idalias, Usuario u);
    public Usuario listarUsuario(String idalias);
    public boolean validarUsuario(Usuario idalias, String password);
    
    
}

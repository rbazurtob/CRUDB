
package reto5.crudb.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import reto5.crudb.DAO.Interfaces.IUsuario;
import reto5.crudb.Modelos.Usuario;


public class IUsuarioImpl implements IUsuario {

   // public IUsuarioImpl() {
    //}

    
    
    @Override
    public boolean agregarUsuario(Usuario u) {
        BaseDatos base = new BaseDatos();
        try {
            
            String sql = "INSERT INTO usuario(id_alias, nombres, apellidos, email, celular, password) VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = base.conn.prepareStatement(sql);
            stmt.setString(1, u.getId_alias());
            stmt.setString(2, u.getNombres());
            stmt.setString(3, u.getApellidos());
            stmt.setString(4, u.getEmail());
            stmt.setString(5, u.getCelular());
            stmt.setString(6, u.getPassword());
            stmt.executeUpdate(); 
            return true;
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return false;
    }

    @Override
    public String eliminarUsuario(String idalias) {
        BaseDatos base = new BaseDatos();
        try {
            
            String sql = "DELETE FROM usuario WHERE id_alias=?";
            PreparedStatement stmt = base.conn.prepareStatement(sql);
            stmt.setString(1, idalias);
            stmt.executeUpdate(); 
            return "Eliminado";
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return "No ha sido posible la eliminación";
    }

    @Override
    public boolean actualizarUsuario(String idalias, Usuario u) {
        BaseDatos base = new BaseDatos();
        try {
            
            String sql = "UPDATE usuario SET id_alias=?, nombres=?, apellidos=?, email=?, celular=?, password=? WHERE id_alias=?";
            PreparedStatement statement = base.conn.prepareStatement(sql);
            statement.setString(1, u.getId_alias());
            statement.setString(2, u.getNombres());
            statement.setString(3, u.getApellidos());
            statement.setString(4, u.getEmail());
            statement.setString(5, u.getCelular());
            statement.setString(6, u.getPassword());
            statement.setString(7, idalias);
            //System.out.println(stmt);
            statement.executeUpdate(); 
            return true;
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        return false;
    }

    @Override
    public Usuario listarUsuario(String idalias) {
        BaseDatos base = new BaseDatos();
        Usuario u = new Usuario();
        
        try {
            Statement stmt = base.conn.createStatement();
            String sql = "SELECT * from usuario where id_alias='"+idalias+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                return (new Usuario(rs.getString("id_alias"),rs.getString("nombres"),rs.getString("apellidos"),rs.getString("email"),rs.getString("celular"),rs.getString("password")));
            }    
            } catch (Exception e) {
        }
         //To change body of generated methods, choose Tools | Templates.
        return null; 
    }

    //@Override
    public boolean validarUsuario(String idalias, String password) {
        BaseDatos base = new BaseDatos();
        try {
            Statement stmt = base.conn.createStatement();
            String sql = "SELECT * from usuario where id_alias='"+idalias+"' and password='"+password+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                return true;
            }    
            } catch (Exception e) {
        }
         //To change body of generated methods, choose Tools | Templates.
        return false; 
    }

    @Override
    public boolean validarUsuario(Usuario idalias, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


package reto5.crudb.DAO.Interfaces;

import reto5.crudb.Modelos.Serie;


public interface ISerie {
    public boolean agregarSerie(Serie s);
    public boolean eliminarSerie(int id_serie);
    public boolean actualizarLibro(String titulo, Serie s);
    public Serie listarLibro(int id_serie);

    
}

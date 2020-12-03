
package reto5.crudb.Modelos;


public class Serie {
    private int id_serie;
    private String titulo;
    private int num_episodios;
    private int num_temporadas;

    public Serie(int id_serie, String titulo, int num_episodios, int num_temporadas) {
        this.id_serie = id_serie;
        this.titulo = titulo;
        this.num_episodios = num_episodios;
        this.num_temporadas = num_temporadas;
    }

        
    public int getId_serie() {
        return id_serie;
    }

    public void setId_serie(int id_serie) {
        this.id_serie = id_serie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNum_episodios() {
        return num_episodios;
    }

    public void setNum_episodios(int num_episodios) {
        this.num_episodios = num_episodios;
    }

    public int getNum_temporadas() {
        return num_temporadas;
    }

    public void setNum_temporadas(int num_temporadas) {
        this.num_temporadas = num_temporadas;
    }



    
}

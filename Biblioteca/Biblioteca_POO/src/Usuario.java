import java.util.List;        
import java.util.ArrayList;   

class Usuario{
    public String nombre;
    public List<RecursoBibliografico> recursosPrestados;

    Usuario(String nombre) {
        this.nombre = nombre;
        this.recursosPrestados = new ArrayList<>();
    }

    public void prestarRecurso(RecursoBibliografico recurso) {
        recursosPrestados.add(recurso);
    }

    public void devolverRecurso(RecursoBibliografico recurso) {
        recursosPrestados.remove(recurso);
    }

}
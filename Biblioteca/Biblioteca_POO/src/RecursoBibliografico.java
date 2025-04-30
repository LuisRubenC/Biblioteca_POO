abstract class RecursoBibliografico{
    public String titulo;
    public String autor;

    RecursoBibliografico(String titulo,String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    abstract void mostrarDetalle();

}
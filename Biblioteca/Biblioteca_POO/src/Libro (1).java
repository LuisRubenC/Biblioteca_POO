class Libro extends RecursoBibliografico{
    public String edicion;
    public boolean prestado;

    Libro(String titulo, String autor, String edicion, boolean prestado) {
        super(titulo, autor);
        this.edicion = edicion;
        this.prestado = prestado;  
    }

     @Override

    void mostrarDetalle() {
        System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nEdicion: "+edicion);
        if(prestado == true)
        System.out.println("El libro actualmente fue prestado");
        else
        System.out.println("El libro se encuentra disponible para prestamo");
    }

}
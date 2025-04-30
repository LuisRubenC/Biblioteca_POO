class Revista extends RecursoBibliografico{
    public int anioPublicacion;
    public int ejemplares;

    Revista(String titulo, String autor, int anioPublicacion, int ejemplares) {
        super(titulo, autor);
        this.anioPublicacion = anioPublicacion;
        this.ejemplares = ejemplares;  
    }

   @Override
   
    void mostrarDetalle() {
        System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nAnio de publicacion: "+anioPublicacion+"\nNumero de ejemplares: "+ ejemplares);        
    }
    
}
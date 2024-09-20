package libros;

public class Libros {

    String titulo;
    String autor;
    int numeropagina;
    int publicacion;

    public Libros (String titulo, String autor, int numeropagina, int publicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.numeropagina = numeropagina;
        this.publicacion = publicacion;
    }

    public void mostrarDatos(){
        System.out.println("El titulo del libro es: "+ titulo);
        System.out.println("El autor del libro es: "+ autor);
        System.out.println("El numero de pagina es: "+ numeropagina);
        System.out.println("El año de publicación es: "+ publicacion);
    }

    public void cambiarTitulo(String titulo){
        this.titulo = titulo;
    }
    public void cambiarAutor(String autor){
        this.autor = autor;
    }
    public void cambiarNumeropagina(int numeropagina){
        this.numeropagina = numeropagina;
    }
    public void cambiarPublicacion(int publicacion){
        this.publicacion = publicacion;
    }
    public String mostrarTitulo(){
        return titulo;
    }
    public String mostrarAutor(){
        return autor;
    }
    public int mostrarNumeropagina(){
        return numeropagina;
    }
    public int mostrarPublicacion(){
        return publicacion;
    }


}

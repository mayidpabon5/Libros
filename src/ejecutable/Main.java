package ejecutable;

import libros.Libros;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libros libroUno = new Libros("El pez en el mar", "Roberto Lopez", 200, 1990);
        Libros librodos = new Libros("el patriarcado", "Juan Perez", 400, 2000);

        libroUno.mostrarDatos();
        System.out.println("--------------------------------------------");
        librodos.mostrarDatos();
        System.out.println("--------------Autores cambiados-------------");
        libroUno.cambiarAutor("Mayid Pabón");
        librodos.cambiarAutor("Rafael Novoa");
        libroUno.mostrarDatos();
        System.out.println("--------------Autores cambiados-----------");
        librodos.mostrarDatos();
        System.out.println("--------------------------------------------");
        System.out.println("El autor es " + librodos.mostrarAutor());;


    }
}
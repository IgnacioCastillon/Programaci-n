public class Prueba {
    public static void main(String[] args) {

        Director d1 = new Director("Quentin", 84);
        Director d2 = new Director("Arturo", 52);

        Actor ac1 = new Actor("Ayax", 31);
        Actor ac2 = new Actor("Prok", 31);

        Pelicula p1 = new Pelicula("Las aventuras de Pepito", 1928, "Drama", d1, ac1);
        Pelicula p2 = new Pelicula("Julai folk", 1294, "Accion", d2, ac2);

        System.out.println(p1);
        System.out.println(p2);

    }
}

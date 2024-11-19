public class Pelicula{
    private String titulo;
    private int anoEstreno;
    private String genero;
    private Director director;
    private Actor actor;

    public Pelicula(String titulo, int anoEstreno, String genero, Director director, Actor actor) {
        this.titulo = titulo;
        this.anoEstreno = anoEstreno;
        this.genero = genero;
        this.director = director;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoEstreno() {
        return anoEstreno;
    }

    public void setAnoEstreno(int anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void mostrarDetalles(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Año Estreno: " + getAnoEstreno());
        System.out.println("Genero: " + getGenero());
        System.out.println("Director: " + getDirector());
        System.out.println("Actor: " + getActor());
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Titulo= ``" + titulo +"``\n"+
                "Año Estreno= " + anoEstreno +'\n'+
                "Genero= ``" + genero + "``\n"+
                "Director= " + director +'\n'+
                "Actor= " + actor +'\n'+
                '}'+super.toString();
    }
}

public class Musicas {
    private String titulo;
    private  Artistas artistas;
    private double duracaoEmSegundos;

    public Musicas(String titulo,double duracaoEmSegundos, Artistas artistas ){
        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.artistas = artistas;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public Artistas getArtistas() {
        return artistas;
    }


    @Override
    public String toString(){
        return titulo + " - " + artistas.getNome() + " (" + duracaoEmSegundos + "s)";
    }
}

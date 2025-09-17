import java.util.ArrayList;

public class Playlists {
    private  String nome;
    private ArrayList<Musicas> musicas;

    public Playlists(String nome){
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musicas musica){
        musicas.add(musica);
    }

    public void removerMusica(String nomeMusica){
        boolean encontrado = false;
        for(Musicas m : musicas){
            if(nomeMusica.equals(m.getTitulo())){
                encontrado = true;
                musicas.remove(m);
                System.out.println("Musica "+m.getTitulo()+ " removida com sucesso!");
            }
        } if(!encontrado){
            System.out.println("Musica nao encontrada!");
        }
    }

    public void duracaoTotalPlaylist(){
        double somaTotal = 0;
        for (Musicas m : musicas){
            somaTotal += m.getDuracaoEmSegundos();
        }
        System.out.println("A Playlist tem um total de "+somaTotal+" segundos!");
    }

    public void listarMusicas(){
        for(Musicas m : musicas){
            System.out.println(m);
        }
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Musicas> getMusicas() {
        return musicas;
    }
}

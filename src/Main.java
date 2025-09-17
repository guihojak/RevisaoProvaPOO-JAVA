public class Main {
     public static void main(String[] args) {
        Artistas art1 = new Artistas("JoaoMid");
        Artistas art2 = new Artistas("HojakMid");
        Artistas art3 = new Artistas("Bagricius");

        Musicas m1 = new Musicas("MAQUINA DO TEMPO", 120,art2);
        Musicas m2 = new Musicas("ELEPHANTE",134,art1);
        Musicas m3 = new Musicas("777-666",215,art3);

        Playlists playlists = new Playlists("Hojak Playlist");

        playlists.adicionarMusica(m1);
        playlists.adicionarMusica(m2);
        playlists.adicionarMusica(m3);

        playlists.listarMusicas();

        playlists.duracaoTotalPlaylist();

        playlists.removerMusica(m2.getTitulo());

        playlists.listarMusicas();

    }
}

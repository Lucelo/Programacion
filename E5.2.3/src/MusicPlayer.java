/*
Ejercicio 3.
Crea una interfaz "MusicPlayer" con dos métodos abstractos "void play()" y
"void stop()". Luego crea dos interfaces adicionales "OnlineMusicPlayer" y
"OfflineMusicPlayer" que hereden de la interfaz "MusicPlayer".

● La interfaz "OnlineMusicPlayer" tendrá un método abstracto "void stream()".

● La interfaz "OfflineMusicPlayer" tendrá un método abstracto "void load()".

Luego crea tres clases "Spotify", "iTunes" y "MP3Player" que implementen las interfaces
"OnlineMusicPlayer" (el primero) y "OfflineMusicPlayer", los demás.

La clase "Spotify" tendrá un método que imprima "Streaming music on Spotify".

La clase "iTunes" tendrá un método que imprima "Loading music on iTunes".

La clase "MP3Player" tendrá un método que imprima "Playing music on MP3 Player".

Finalmente, crea una clase "MusicApp" que tenga un método "startMusic(MusicPlayer[]
players)" que llame a los métodos "stream()" o "load()" y "play()" de cada objeto
"MusicPlayer".

MusicPlayer[] players = new MusicPlayer[]{new Spotify(), new iTunes(), new MP3Player()};
MusicApp app = new MusicApp();
app.startMusic(players);

 */

//Crea una interfaz "MusicPlayer" con dos métodos abstractos "void play()" y
//"void stop()". Luego crea dos interfaces adicionales "OnlineMusicPlayer" y
//"OfflineMusicPlayer" que hereden de la interfaz "MusicPlayer".

//La interfaz "OnlineMusicPlayer" tendrá un método abstracto "void stream()".
//La interfaz "OfflineMusicPlayer" tendrá un método abstracto "void load()".

public class MusicPlayer {

    private double stream;
    private double load;
    private double play;
    private double musicplayer;


    public MusicPlayer(){
        this.stream;
        this.load;
        this.play;

    }

    public static void main(String[] args) {
        MusicPlayer[] players = new MusicPlayer[]{new Spotify(), new iTunes(), new MP3Player()};
        MusicApp app = new MusicApp();
        app.startMusic(players);
    }





}
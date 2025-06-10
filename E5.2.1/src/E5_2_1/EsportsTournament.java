package E5_2_1;

public class EsportsTournament {
    public static void main(String[] args) {
        Gamer fps= new FPSGamer();
        Gamer mobaGamer= new MOBAGamer();
        Gamer sportsGamer= new SportsGamer();
        Gamer gamer= new Gamer[]{fps, mobaGamer, sportsGamer};
        startournament(gamer);
    }

    public static void startournament(Gamer[] jugadores) {
        for (Gamer g : jugadores) {
            g.playgame();
        }
    }

}

public class Kamera {
    public static double berechneBreite(double hoehe) {
        return hoehe * 2;
    }

    public static double berechneLaenge(double hoehe) {
        return hoehe * 0.9;
    }

    public static void fotoMachen(Position position) {
        System.out.println("Foto gemacht bei " + position);
    }
}



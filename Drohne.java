public class Drohne {
    public void drohneStartet(Gebiet gebiet, double xSchritt, double ySchritt) {

        double xStart = gebiet.minX();
        double xEnde = gebiet.maxX();
        double yStart = gebiet.minY();
        double yEnde = gebiet.maxY();

        boolean aufwaerts = true;

        System.out.println(" Starte flug");

        int fotoZaehler = 0;

        for (double y = yStart; y <= yEnde; y += ySchritt) {
            if (aufwaerts) {

                //Von links nach rechts
                for (double x = xStart; x <= xEnde; x += xSchritt) {
                    if (fotoZaehler % 2 == 0) {
                        Position position = new Position(x, y);
                        Kamera.fotoMachen(position);
                    }
                    fotoZaehler++;
                }
            } else {
                //von rechts nach links
                for (double x = xEnde; x >= xStart; x -= xSchritt) {
                    if (fotoZaehler % 2 == 0) {
                        Position position = new Position(x, y);
                        Kamera.fotoMachen(position);
                    }
                    fotoZaehler++;
                }
            }
            //Richtungswechsel
            aufwaerts = !aufwaerts;
        }
        System.out.println("Flug abgeschlossen.");
    }
}

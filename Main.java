import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib 4 Punkte ein in Meter ein (0/0 muss der Startpunkt sein)");


        System.out.print("Punkt 1 - X: ");
        double x1 = scanner.nextDouble();
        System.out.print("Punkt 1 - Y: ");
        double y1 = scanner.nextDouble();
        Position p1 = new Position(x1, y1);

        System.out.print("Punkt 2 - X: ");
        double x2 = scanner.nextDouble();
        System.out.print("Punkt 2 - Y: ");
        double y2 = scanner.nextDouble();
        Position p2 = new Position(x2, y2);

        System.out.print("Punkt 3 - X: ");
        double x3 = scanner.nextDouble();
        System.out.print("Punkt 3 - Y: ");
        double y3 = scanner.nextDouble();
        Position p3 = new Position(x3, y3);

        System.out.print("Punkt 4 - X: ");
        double x4 = scanner.nextDouble();
        System.out.print("Punkt 4 - Y: ");
        double y4 = scanner.nextDouble();
        Position p4 = new Position(x4, y4);

        Gebiet gebiet = new Gebiet(p1, p2, p3, p4);

        System.out.print("Gib die Flughöhe in Meter ein: ");
        double hoehe = scanner.nextDouble();

        double breite = Kamera.berechneBreite(hoehe);
        double laenge = Kamera.berechneLaenge(hoehe);

        double xSchritt = breite;
        double ySchritt = laenge;

        Drohne drohne = new Drohne();
        drohne.drohneStartet(gebiet, xSchritt, ySchritt);
    }
}

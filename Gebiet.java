public class Gebiet {
    private Position p1, p2, p3, p4;


    public Gebiet(Position p1, Position p2, Position p3, Position p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }


    public Position getP1() {
        return p1;
    }

    public void setP1(Position p1) {
        this.p1 = p1;
    }

    public Position getP2() {
        return p2;
    }

    public void setP2(Position p2) {
        this.p2 = p2;
    }

    public Position getP3() {
        return p3;
    }

    public void setP3(Position p3) {
        this.p3 = p3;
    }

    public Position getP4() {
        return p4;
    }

    public void setP4(Position p4) {
        this.p4 = p4;
    }

    // Berechnungen der minimalen und maximalen Koordinaten
    public double minX() {
        return Math.min(Math.min(p1.getX(), p2.getX()), Math.min(p3.getX(), p4.getX()));
    }

    public double maxX() {
        return Math.max(Math.max(p1.getX(), p2.getX()), Math.max(p3.getX(), p4.getX()));
    }

    public double minY() {
        return Math.min(Math.min(p1.getY(), p2.getY()), Math.min(p3.getY(), p4.getY()));
    }

    public double maxY() {
        return Math.max(Math.max(p1.getY(), p2.getY()), Math.max(p3.getY(), p4.getY()));
    }
}

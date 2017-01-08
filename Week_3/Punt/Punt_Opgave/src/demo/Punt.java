package demo;

public class Punt  {
    int x;
    int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Punt p) {
        int distX = Math.abs(this.x - p.x);
        int distY = Math.abs(this.y - p.y);
        return Math.sqrt((Math.pow(distX, 2) + Math.pow(distY, 2)));
    }

    public double distanceToCenter() {
        return distance(new Punt(0,0));
    }

    public int compareTo(Punt p) {
        if (this.equals(p) || (this.distanceToCenter() == p.distanceToCenter())){
            return 0;
        }else if (this.distanceToCenter() > p.distanceToCenter()){
            return 5;
        }else {
            return -5;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Punt punt = (Punt) o;

        if (x != punt.x) return false;
        return y == punt.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}

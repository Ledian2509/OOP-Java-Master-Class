public class Drone {

    private int x;
    private int y;

    public Drone(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Drone(){
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double travelTo(){
        return travelTo(0,0);
    }

    public double travelTo (Drone newDrone){
        return travelTo(newDrone.getX(),newDrone.getY());
    }

    public double travelTo(int x, int y){
        return Math.sqrt(
                ((x - this.x) * (x - this.x))
                        +
                        ((y - this.y) * (y - this.y))
        );
    }
}

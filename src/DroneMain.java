public class DroneMain {

    public static void main(String[] args) {


        Drone first = new Drone(6, 5);
        Drone second = new Drone(3, 1);
        System.out.println("distance(0,0)= " + first.travelTo());
        System.out.println("distance(second)= " + first.travelTo(second));
        System.out.println("distance(2,2)= " + first.travelTo(2, 2));
        Drone third = new Drone();
        System.out.println("distance()= " + third.travelTo());
    }
}

public class WallMain {

    public static void main(String[] args) {

        Wall wall = new Wall(5, 4);
        Wall wall1 = new Wall();
        System.out.println("area= " + wall.getArea());
        System.out.println("area= " + wall1.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}

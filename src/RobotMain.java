public class RobotMain {

    public static void main(String[] args) {
        Robot r1 = new Robot("R2D2", 100);
        Robot r2 = new Robot("C3PO", 50);

        r1.sendEnergy(r2, 30);

        System.out.println(r1.getEnergy());
        System.out.println(r2.getEnergy());

        r1.recharge();
        System.out.println(r1.getEnergy());

        r2.recharge(20);
        System.out.println(r2.getEnergy());
    }
}

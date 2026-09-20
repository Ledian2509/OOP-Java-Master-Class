public class Robot {

    private String name;
    private int energy;

    public Robot() {
        this("Unknown",0);
    }


    public Robot(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void recharge(){
        this.energy += 10;
    }

    public void recharge(int amount){
        this.energy += amount;
    }

    public void sendEnergy(Robot otherRobot, int amount){
        if (this.energy >= amount){
            otherRobot.energy += amount;
            this.energy -= amount;
        }else
            System.out.print("Energy " + amount + "from robot: " + this.name);
    }
}

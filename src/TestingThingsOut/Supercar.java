package TestingThingsOut;

public class Supercar extends TestAuto {

    private String doors;
    public Supercar(String model, String brand,String doors) {
        super(model,brand);
        this.doors=doors;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }
}

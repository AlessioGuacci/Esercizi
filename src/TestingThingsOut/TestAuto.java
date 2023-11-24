package TestingThingsOut;

public class TestAuto {

    private String model;
    private String brand;

    public TestAuto(String model, String brand){
        this.brand= brand;
        this.model= model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
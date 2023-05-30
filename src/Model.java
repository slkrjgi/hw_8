public class Model extends MobilePhone implements Mobile, Camera {
    private String name;
    private Byte lighterLevel;
    private double modelCost;

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void Call() {
        System.out.println("Calling for" + this.name + " model");
    }

    @Override
    public byte lighter() {
        return this.lighterLevel;
    }

    @Override
    public String getModelName() {
        return this.name;
    }

    @Override
    public void setModelName(String name) {
        this.name = name;
    }

    public double getModelCost() {
        return this.modelCost;
    }

    public void setModelCost(double modelCost) {
        this.modelCost = modelCost;
    }

    @Override
    public void takePhoto() {
        System.out.println("The " + this.name + " has taken a photo!");
    }
}

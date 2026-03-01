/**
 * @author Benjamin le
 *use Flight interface
 */

public class Airplane implements Flight,Movement {
    private String model;
    private int yearBuilt;
    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }
    //setter
    public void setModel(String model) {
        this.model = model;
    }
    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    //getter
    public String getModel() {
        return model;
    }
    public int getYearBuilt() {
        return yearBuilt;
    }

    @Override
    public void fly() {
        System.out.println("I’m an airplane that relies on an engine to fly.");
    }

    @Override
    public String toString() {
        return "Airplane[" + "model=" + model + ", year=" + yearBuilt + "]: ";
    }

    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");
    }
    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }
}

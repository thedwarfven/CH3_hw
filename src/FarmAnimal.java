/**
 * @author Benjamin le
 * parent of Chicken, Cow, Duck
 */

public abstract class FarmAnimal {
    private String name;
    private boolean gender; // True as male, false as female
    private double weight;
    private int age;

    public FarmAnimal(String name, boolean gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //getters
    public String getName() {
        return name;
    }
    public boolean isGender() {
        return gender;
    }
    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        //using String.format to return bool gender as male/female instead of  true/false
        //%.1f to return float with 1 decimal place
        return String.format("[name=%s, gender=%s, weight=%.1f, age=%d]", name, gender ? "male" : "female", weight, age);
    }

    public abstract String feedLoadingSchedule();
}

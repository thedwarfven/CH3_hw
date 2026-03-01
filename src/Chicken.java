/**
 * @author Benjamin le
 * child of FarmAnimal
 */


public class Chicken extends FarmAnimal{
    private String sound;
    public Chicken(String sound,String name, boolean gender, double weight, int age) {
        super(name,gender,weight,age);
        this.sound=sound;
    }
    //getter and setter
    public void setSound(String sound){
        this.sound=sound;
    }
    public String getSound(){
        return this.sound;
    }

    @Override
    public String toString(){
        return "Chicken" + sound + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return super.getName() + ": 8am-12pm-6pm";
    }


}

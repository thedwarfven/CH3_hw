/**
 * @author Benjamin le
 * child of FarmAnimal
 */


public class Cow extends FarmAnimal{
    private String sound;
    public Cow(String sound,String name, boolean gender, double weight, int age) {
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
        return "Cow" + sound + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return super.getName() + ": 6am-4pm";
    }


}
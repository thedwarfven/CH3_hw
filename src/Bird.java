/**
 * @author Benjamin le
 *use Flight interface
 */

public class Bird implements Flight, Movement {
    private String type;
    public Bird(String type) {
        this.type = type;
    }
    //setter and getter
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    @Override
    public void fly() {
        System.out.println("I’m a bird who flaps wings to fly.");
    }

    @Override
    public String toString() {
        return "Bird [type=" + type + "]: ";
    }


    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }
}

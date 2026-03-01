import java.util.ArrayList;

/**
 * @author Benjamin le
 * tester class of FarmAnimal
 */

public class MyFarm {
   public static void main(String[] args) {
       ArrayList<FarmAnimal> animals = new ArrayList<>();
       Duck d1 = new Duck("Quack Quack ","Donald",true,3.2,5);
       Duck d2 = new Duck("Quack Quack ","Cheese",false,3.6,5);
       Cow c1 = new Cow("Moo Moo ","Molly",false,1600.0,3);
       Chicken c2 = new Chicken("Cock-a-Doodle-doo ","Albert",true,1.6,2);
       Chicken c3 = new Chicken("Cluck Cluck ","Amelia",false,1.8,4);
       Chicken c4 = new Chicken("Cluck Cluck ","Dixie",false,1.7,4);
       animals.add(d1);
       animals.add(d2);
       animals.add(c1);
       animals.add(c2);
       animals.add(c3);
       animals.add(c4);
       for (FarmAnimal animal : animals) {
           System.out.println(animal);
       }
       for (FarmAnimal animal : animals) {
           System.out.println(animal.feedLoadingSchedule());
       }
   }
}

import java.util.Objects;

public class Herbivore extends Mammal {
    protected String foodType;

    public Herbivore(String name, int age, String environment, int speed, String foodType){
        super(name, age, environment, speed);
        this.foodType = foodType;
    }

    public void graze(){
        System.out.println("Пошёл пастись.");
    }

    @Override
    public void eat() {
        System.out.println("Пошёл есть.");
    }

    @Override
    public void go() {
        System.out.println("Пошёл.");
    }


    public String getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "foodType='" + foodType + '\'' +
                ", environment='" + environment + '\'' +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(foodType, herbivore.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }
}

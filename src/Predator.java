import java.util.Objects;

public class Predator extends Mammal {
    protected String foodType;

    public Predator(String name, int age, String environment, int speed, String foodType){
        super(name, age, environment, speed);
        this.foodType = foodType;
    }

    public void hunt(){
        System.out.println("Пошёл охотиться.");
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
        return "Predator{" +
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
        Predator predator = (Predator) o;
        return Objects.equals(foodType, predator.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }
}

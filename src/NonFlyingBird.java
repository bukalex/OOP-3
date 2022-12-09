import java.util.Objects;

public class NonFlyingBird extends Bird {
    private String movementType;

    public NonFlyingBird(String name, int age, String environment, String movementType){
        super(name, age, environment);
        this.movementType = movementType;
    }

    public void walk(){
        System.out.println("Пошёл гулять.");
    }

    @Override
    public void eat() {
        System.out.println("Пошёл есть.");
    }

    @Override
    public void go() {
        System.out.println("Пошёл.");
    }


    public String getMovementType() {
        return movementType;
    }

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "movementType='" + movementType + '\'' +
                ", environment='" + environment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NonFlyingBird that = (NonFlyingBird) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }
}

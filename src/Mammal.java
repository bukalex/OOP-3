import java.util.Objects;

public abstract class Mammal extends Animal {
    protected String environment;
    protected int speed;

    public Mammal(String name, int age, String environment, int speed){
        super(name, age);
        this.environment = environment;
        this.speed = speed;
    }


    public String getEnvironment() {
        return environment;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(environment, mammal.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment, speed);
    }
}

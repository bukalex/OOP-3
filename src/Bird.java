import java.util.Objects;

public abstract class Bird extends Animal {
    protected String environment;

    public Bird(String name, int age, String environment){
        super(name, age);
        this.environment = environment;
    }

    public void hunt(){
        System.out.println("Пошёл охотиться.");
    }


    public String getEnvironment() {
        return environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(environment, bird.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment);
    }
}

import java.util.Objects;

public class Amphibian extends Animal {
    private String environment;

    public Amphibian(String name, int age, String environment){
        super(name, age);
        this.environment = environment;
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


    public String getEnvironment() {
        return environment;
    }

    @Override
    public String toString() {
        return "Amphibian{" +
                "environment='" + environment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(environment, amphibian.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment);
    }
}

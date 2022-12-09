public class Main {
    public static void main(String[] args) {
        Herbivore gazel = new Herbivore("Газель", 1, "саванна", 40, "растения");
        Herbivore giraffe = new Herbivore("Жираф", 1, "саванна", 20, "растения");
        Herbivore horse = new Herbivore("Лошадь", 1, "поля", 40, "растения");

        Predator hyena = new Predator("Гиена", 1, "саванна", 40, "мясо");
        Predator tiger = new Predator("Тигр", 1, "саванна", 40, "мясо");
        Predator bear = new Predator("Медведь", 1, "тундра", 40, "мясо");

        Amphibian frog = new Amphibian("Лягушка", 1, "болото");
        Amphibian grassSnake = new Amphibian("Уж", 1, "болото");

        NonFlyingBird peacock = new NonFlyingBird("Павлин", 1, "неизвестно", "неизвестно");
        NonFlyingBird pinguin = new NonFlyingBird("Пингвин", 1, "неизвестно", "неизвестно");
        NonFlyingBird dodo = new NonFlyingBird("Додо", 0, "вымерли", "вымерли");

        FlyingBird seagull = new FlyingBird("Чайка", 1, "скалы", "летает");
        FlyingBird albatross = new FlyingBird("Альбатрос", 1, "скалы", "летает");
        FlyingBird falcon = new FlyingBird("Сокол", 1, "скалы", "летает");


        System.out.println(gazel);
        System.out.println(giraffe);
        System.out.println(horse);

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        System.out.println(frog);
        System.out.println(grassSnake);

        System.out.println(peacock);
        System.out.println(pinguin);
        System.out.println(dodo);

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

        System.out.println(compareAnimals(gazel, dodo));
    }

    public static boolean compareAnimals(Animal animal1, Animal animal2){
        return animal1.equals(animal2);
    }
}
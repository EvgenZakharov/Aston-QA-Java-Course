package src.lesson7;

public class Cat extends Animal{
    private static int catCount = 0;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        this.satiety = false; // изначально кот голодный
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFoodAmount() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            this.satiety = true;
            System.out.println(name + " поел и теперь сыт");
        } else {
            System.out.println(name + " не хватает еды, чтобы поесть");
        }
    }
}

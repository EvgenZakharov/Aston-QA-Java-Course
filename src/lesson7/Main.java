package src.lesson7;

public class Main {
    public static void main(String[] args) {
//      1 Задание
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Бобик");

        Bowl bowl = new Bowl(20);

        cat1.run(150);
        cat2.swim(5);
        dog1.run(600);
        dog1.swim(5);

        Cat[] cats = {cat1, cat2};

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
            System.out.println(cat.name + " сытость: " + cat.isSatiety());
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        bowl.addFood(15);

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
            System.out.println(cat.name + " сытость: " + cat.isSatiety());
        }

//      2 Задание
        Circle circle = new Circle(5);
        circle.setFillColor("Red");
        circle.setBorderColor("Black");

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.setFillColor("Blue");
        rectangle.setBorderColor("Green");

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.setFillColor("Yellow");
        triangle.setBorderColor("Purple");

        printShapeDetails(circle);
        printShapeDetails(rectangle);
        printShapeDetails(triangle);
    }

    private static void printShapeDetails(Shape shape) {
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Fill Color: " + shape.getFillColor());
        System.out.println("Border Color: " + shape.getBorderColor());
        System.out.println();
    }

}

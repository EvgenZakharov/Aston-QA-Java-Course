package src.lesson6;

public class Park {
    // Внутренний класс Attraction
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        // Конструктор для инициализации аттракциона
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Геттеры для получения информации об аттракционе
        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }

        // Метод для отображения информации об аттракционе
        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
        }
    }
}


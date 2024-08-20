package src.lesson6;

public class MainPark {
    public static void main(String[] args) {
        // Создаем объект парка
        Park park = new Park();

        // Создаем объекты аттракционов
        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00 - 18:00", 500.0);
        Park.Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "09:00 - 20:00", 300.0);

        // Отображаем информацию об аттракционах
        rollerCoaster.displayInfo();
        System.out.println();
        ferrisWheel.displayInfo();
    }
}

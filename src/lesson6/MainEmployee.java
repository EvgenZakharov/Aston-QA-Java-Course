package src.lesson6;

public class MainEmployee {
    // Метод main для тестирования класса
    public static void main(String[] args) {
        // Создание массива сотрудников
        Employee[] employees = new Employee[5];

        // Инициализация массива объектами класса Employee
        employees[0] = new Employee("Иван Иванов", "Инженер", "ivanov@example.com", "+1234567890", 50000, 30);
        employees[1] = new Employee("Петр Петров", "Менеджер", "petrov@example.com", "+1234567891", 55000, 35);
        employees[2] = new Employee("Сергей Сергеев", "Аналитик", "sergeev@example.com", "+1234567892", 60000, 28);
        employees[3] = new Employee("Анна Антонова", "Дизайнер", "antonova@example.com", "+1234567893", 48000, 25);
        employees[4] = new Employee("Мария Маркова", "Программист", "markova@example.com", "+1234567894", 70000, 40);

        // Вывод информации о каждом сотруднике
        for (Employee employee : employees) {
            employee.printInfo();
        }
    }
}

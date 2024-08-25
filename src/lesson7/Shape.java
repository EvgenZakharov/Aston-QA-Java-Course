package src.lesson7;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();

    String getFillColor();
    void setFillColor(String color);

    String getBorderColor();
    void setBorderColor(String color);
}

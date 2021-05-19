package be.intecbrussel;

public class RectangleApp {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,5);
        System.out.println("this program uses a rectangle");
        rect.setPosition(6,6);
//        rect.setX(5);
//        rect.setY(6);
        //rect.setHeight(-15);
        //rect.setWidth(-15);
        rect.setGrow(0);



        rect.getArea();



        rect.getPerimeter();


        System.out.println("The growth of the rectangle is: " + rect.getGrow());
        System.out.println("The value of x is: " + rect.getY());
        System.out.println("The value of y is: " + rect.getX());
        System.out.println("height is: " + rect.getHeight() + "cm");
        System.out.println("width is: " + rect.getWidth() + "cm");
        System.out.println("\nthis is the perimeter of the rectangle: " + rect.getPerimeter() + "cm");
        System.out.println("\nthis is the area of the rectangle: " + rect.getArea() + "cm²");

        rect.newRectangle(4,5,6,8);

        System.out.println("The rectangle has " + rect.ANGLES + " angles.");
        System.out.println("Amount of objects: " + rect.amountOfObjects);

    }
}


package Activity20;

public class abstractClasses {
    public static void main(String[] args) {
        package abstractClasses;

        public abstract class Shape {
            public abstract double area();
        }

        public class Circle extends Shape {
            private double radius;

            public Circle(double radius) {
                this.radius = radius;
            }

            public double getRadius() {
                return radius;
            }

            public void setRadius(double radius) {
                this.radius = radius;
            }

            public double area() {
                return Math.PI * radius * radius;
            }
        }

        public class Rectangle extends Shape {
            private double width;
            private double height;

            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            public double getWidth() {
                return width;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            public double getHeight() {
                return height;
            }

            public void setHeight(double height) {
                this.height = height;
            }

            public double area() {
                return width * height;
            }
        }

        public class ShapeTest {
            public static void main(String[] args) {
                Circle circle = new Circle(5.0);
                Rectangle rectangle = new Rectangle(4.0, 6.0);

                System.out.println("Circle area: " + circle.area());
                System.out.println("Rectangle area: " + rectangle.area());
            }
        }

    }
}

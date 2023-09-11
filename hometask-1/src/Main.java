
class Circle{
    public Circle(float radius){
        _radius = radius;
    }
    float _radius;
    float getArea(){
        return 3.14f*_radius*_radius;
    }
}

class Rectangle{
    public Rectangle(float side1, float side2){
        _side1 = side1;
        _side2 = side2;
    }
    float _side1;
    float _side2;
    float getArea(){
        return _side1*_side2;
    }
}

class Square extends Rectangle{
    public Square(float side){
        super(side, side);
    }
}

public class Main {
    public static void main(String[] args) {
    }
}
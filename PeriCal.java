public class PeriCal {
    public static void main(String[] args) {
        
    }
}
class Rectangle{
    int length,breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int RectPeri(){
        return (2*(length+breadth));
    }
}

class Circle{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double CirPeri(){
        return (2*3.14*radius);
    }
}

class Square{
    int side;
    Square(int side){
        this.side=side;
    }
    int SqPeri(){
        return (4*side);
    }
}


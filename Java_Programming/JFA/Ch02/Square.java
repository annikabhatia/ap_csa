public class Square {

    int side;

    Square(int a) {
        side = a;
    }

    Square() {
        side = 10;
    }
    
    public int perimeter() {
        int per = 4 * side;
        return per;
    }

    public int area() {
        int a = side * side;
        return a;
    }
}

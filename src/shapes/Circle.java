package shapes;

class Circle extends Shape{
    int radius = 0;
    Circle(int radius){
        this.radius = radius;
    }

    public double area(){
        return 3.14*Math.sqrt(this.radius);
    }
}

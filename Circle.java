public class Circle {
    Point center;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    void move(Point p){
        Point center =new Point (3,4);
    }
    double areaSize(){
        return Math.PI*(Math.pow(radius,2));
    }
    double circumference(){
        return 2 * (Math.PI * radius);
    }
    boolean pointLocation(Point p){
        double x = p.x - center.x;
        double y = p.y - center.y;

        if ((Math.pow(x,2) + (Math.pow(y, 2))) < Math.pow(radius, 2)){
            return true;
        }
        return false;
    }

}

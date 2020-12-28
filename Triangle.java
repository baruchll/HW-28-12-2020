public class Triangle {
    Point p1;
    Point p2;
    Point p3;

    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    Point centerPoint(){
        double x = (p1.x + p2.x + p3.x) / 3;
        double y = (p1.y + p2.y + p3.y) / 3;

        return new Point(x, y);
    }
    double areaSize(){
        double area = ((p2.y - p3.y) + (p3.y - p1.y) + (p1.y - p2.y) / 2);
        return Math.abs(area);
    }
    double perimeter(){
        double ab = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        double bc = Math.sqrt(Math.pow((p3.x - p2.x), 2) + Math.pow((p3.y - p2.y), 2));
        double ca = Math.sqrt(Math.pow((p1.x - p3.x), 2) + Math.pow((p1.y - p3.y), 2));

        return (ab + bc + ca);
    }
    boolean pointLocation(Point s){
        //sac
        double as = Math.sqrt(Math.pow((s.x - p1.x), 2) + Math.pow((s.y - p1.y), 2));
        double sc = Math.sqrt(Math.pow((p3.x - s.x), 2) + Math.pow((p3.y - s.y), 2));
        double ca = Math.sqrt(Math.pow((p1.x - p3.x), 2) + Math.pow((p1.y - p3.y), 2));
        //sbc
        double sb = Math.sqrt(Math.pow((p2.x - s.x), 2) + Math.pow((p2.y - s.y), 2));
        double bc = Math.sqrt(Math.pow((p3.x - p2.x), 2) + Math.pow((p3.y - p2.y), 2));
        double cs = Math.sqrt(Math.pow((s.x - p3.x), 2) + Math.pow((s.y - p3.y), 2));
        //sab
        double ab = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        double bs = Math.sqrt(Math.pow((s.x - p2.x), 2) + Math.pow((s.y - p2.y), 2));
        double sa = Math.sqrt(Math.pow((p1.x - s.x), 2) + Math.pow((p1.y - s.y), 2));

        double sac = as+sc+ca;
        double sbc = sb+bc+cs;
        double sab = ab+bs+sa;

        if ((sab+sac+sbc) == perimeter()){
            return true;
        }
        return false;

    }
}

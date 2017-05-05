public class SolutionPoint {
    public static void main(String[] args) {
        Point point;
        //Default Constructor
        point = new Point();
        System.out.println("Distance between points = " + point.calculateDistance(2, 3));

        //Parameter Constructor1
        Point point1;
        point1 = new Point(2);
        System.out.println("Distance between points = " + point1.calculateDistance(2, 3));

        //Parameter Constructor2
        Point point2;
        point2 = new Point(2,4);
        System.out.println("Distance between points = " + point2.calculateDistance(2, 3));
    }
}
public class Point {
    private int xAxis;
    private int yAxis;

    public Point() {
        xAxis = 0;
        yAxis = 0;
        System.out.println("Defaut Constructor");
    }
    public Point(int axis) {
        xAxis = axis;
        yAxis = axis;
        System.out.println("Paramater Constructor 1");
    }
    public Point(int x, int y) {
        xAxis = x;
        yAxis = y;
        System.out.println("Paramater Constructor 2");
    }
    double calculateDistance(int x, int y){
        return(Math.sqrt(
        Math.pow((x - xAxis),2) +
        Math.pow(y - yAxis, 2)));
    }
}
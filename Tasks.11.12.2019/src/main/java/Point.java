public class Point implements Comparable<Point>{
    private double value;
    private String status;   // start, end, point

    public Point(double value, String status) {
        this.value = value;
        this.status = status;
    }

    public double getValue() {
        return value;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public int compareTo(Point o) {
        if(this.value < o.getValue()){
            return -1;
        }
        else if(this.value > o.getValue()){
            return 1;
        }
        else{
            return 0;
        }
    }
}

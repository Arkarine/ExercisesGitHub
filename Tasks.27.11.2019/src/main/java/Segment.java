public class Segment implements Comparable<Segment> {
    double left;
    double right;

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public Segment(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(Segment o) {
        if(this.getLeft() < o.getLeft()){
            return -1;
        }
        else if(this.getLeft() > o.getLeft()){
            return 1;
        }
        else{
            return 0;
        }
    }
}

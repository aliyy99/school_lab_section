public class point {
    //scranrio0

    public int x;
    public int y;
    public point(int a,int b){
        x=a;
        y=b;
    }
    public double distance(point other){
        double dx=Math.pow(x-other.x,2);
        double dy=Math.pow(y-other.y,2);
        return Math.sqrt(dx+dy);
    }

}

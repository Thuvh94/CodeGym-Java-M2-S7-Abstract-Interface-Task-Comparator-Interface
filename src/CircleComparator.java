import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle circleObj1, Circle circleObj2 ) {
        if(circleObj1.radius > circleObj2.radius)
            return 1;
        else if (circleObj1.radius < circleObj2.radius)
            return -1;
        else
            return 0;
    }
}

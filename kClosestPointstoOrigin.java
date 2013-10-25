import java.util.*;


  class Point {

    public double x;

    public double y;

  } 
  
 public class Solution {
  public static Point[] closestk(Point  myList[], int k ) {
      PriorityQueue<Point> heap = new PriorityQueue<Point>(k, new Comparator<Point>() {
					public int compare(Point a, Point b) {
                        int re = (int)(b.x * b.x + b.y * b.y) - (a.x * a.x + a.y * a.y);
						if(re > 0) return 1;
                        if(re < 0) return -1;
                        return 0;
						}
                    });
      for (Point p : myList) {
            Point q = heap.peek();
			if (heap.size() < k) {
				heap.offer(p);
			} else if ((p.x * p.x + p.y * p.y) - (q.x * q.x + q.y * q.y) < 0) {
				heap.poll();
				heap.offer(p);
			}

      }
      
      Point[] result = new Point[k];
      for(int x = 0; x < k; x++) {
          if(!heap.isEmpty()) {
              result[x] = heap.poll();
          }
      }
      return result;
  

      }
}
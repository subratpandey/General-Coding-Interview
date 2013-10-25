import java.util.*;


  class Point {

    public double x;

    public double y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
    	return "(" + x + "," + y + ")";
    }

  } 
  
 public class Solution {
  public static Point[] closestk(Point  myList[], int k ) {
      PriorityQueue<Point> heap = new PriorityQueue<Point>(k, new Comparator<Point>() {
					public int compare(Point a, Point b) {
						double dista = Math.pow(a.x, 2) + Math.pow(a.y, 2);
						double distb = Math.pow(b.x, 2) + Math.pow(b.y, 2);		
						if(dista > distb) return 1;
                        if(dista < distb) return -1;
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
  public static void main(String[] args) {
      Point[] test = new Point[10];
      for (int i = 0; i < 10; i++) {
              Random rand = new Random();
              int x = rand.nextInt(10) + 1;
              int y = rand.nextInt(10) + 1;
              test[i] = new Point(x, y);
      }
      System.out.println(Arrays.toString(test));
      System.out.println(Arrays.toString(closestk(test, 5)));
}
}
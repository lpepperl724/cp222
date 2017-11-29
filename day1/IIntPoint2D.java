import java.lang.Math;

public class IntPoint2D implements IIntPoint2D {

  int x;
  int y;
  int x2;
  int y2;

  public IntPoint2D(int x_coord, int y_coord) {
    x = x_coord;
    y = y_coord;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int manhattanDistance(IIntPoint2D o) {
    x2 = o.getX();
    y2 = o.getY();
    int ed = Math.abs(x-x2) + Math.abs(y-y2);
    return ed;
  }

  public double distance(IIntPoint2D o) {
    x2 = o.getX();
    y2 = o.getY();
    //
    int d = Math.abs(((x-x2)^2) + ((y-y2)^2));
    double ds = Math.sqrt(d);
    return ds;
  }

  public String toString() {
    String str = "(" + x + "," + y + ")";
    return str;
  }

  public boolean equals(IIntPoint2D o) {
    x2 = o.getX();
    y2 = o.getY();
    if (x == x2 && y == y2) {
      return true;
    }
    return false;
  }

  public int hashcode() {
    int hash = (x<<16)+y;
    return hash;
  }

}


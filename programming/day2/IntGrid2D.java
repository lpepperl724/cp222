import java.util.Arrays;
import java.lang.Math;

public class IntGrid2D implements IIntGrid2D {

  int x;
  int y;
  int ulx;
  int uly;
  int lrx;
  int lry;
  int w;
  int h;
  char val;
  char[][] grid;// = new char[3][3];

  public IntGrid2D(int ulx, int uly, int lrx, int lry, char c) {
    this.ulx = ulx;
    this.uly = uly;
    this.lrx = lrx;
    this.lry = lry;
    w = Math.abs(ulx);
    h = Math.abs(lrx);

    grid = new char[(uly-lry + 1)][(lrx-ulx + 1)];

    for (int i = lry + h; i < uly + h + 1; i++) {
      for (int j = ulx + w; j < lrx + w + 1; j++) {
        grid[i][j] = c;
      }
    }
  }

  public void setPoint(IIntPoint2D p, char v) {
    x = p.getX() + w;
    y = p.getY() + h;
    val = v;
    grid[y][x] = val;
  }

  public char getPoint(IIntPoint2D p) {
    x = p.getX() + w;
    y = p.getY() + h;
    val = grid[y][x];
    return val;
  }

  public IIntPoint2D getUpperLeftCorner() {
    IIntPoint2D gulc = new IntPoint2D(ulx, uly);
    return gulc;
  }

  public IIntPoint2D getLowerRightCorner() {
    IIntPoint2D glrc = new IntPoint2D(lrx, lry);
    return glrc;
  }

}

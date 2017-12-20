public class SelectSort<T extends Comparable> implements ISort<T> {

  int size;
  int idx;
  T tmp;
  /**
   * Sorts an array of items in place
   * @param in An array to sort
   */
  public  void sort(T[] in) {
    size = in.length;
    for (int i = 0; i < size-1; i++) {
      idx = i;
      for (int j = i+1; j < size; j++) {
        if (in[j].compareTo(in[idx]) < 0) {idx = j;}
      }
      tmp = in[idx];
      in[idx] = in[i];
      in[i] = tmp;
    }
  }

  /**
   * Produces the name of the kind of sort implemented
   * @return the name of the sort algorithm
   */
  public String sortName() {
    return "SelectSort";
  }
}

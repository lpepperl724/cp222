public class MergeSort<T extends Comparable> implements ISort<T> {

  T[] in;
  T[] helper;
  int size;
  T[] in2;
  int middle;
  int x;
  int y;
  int z;


  /**
   * Sorts an array of items in place
   * @param in An array to sort
   */
  public void sort(T[] in) {
    this.in = in;
    size = in.length;
    //@SuppressWarnings("unchecked")
    //in2 = (T[]) new Object[size];
    in2 = (T[]) new Integer[size];
    mergeSort(0, size-1);
  }

  public void mergeSort(int start, int end) {
    if (start < end) {
      middle = start + (end-start)/2;
      mergeSort(start, middle);
      mergeSort(middle+1, end);
      merge(start, middle, end);
    }
  }

  public void merge(int start, int middle, int end) {
    for (int i = start; i <= end; i++) {
      in2[i] = in[i];
    }
    x = start;
    y = middle + 1;
    z = start;
    while(x <= middle && y <= end) {
      if (in2[x].compareTo(in2[y]) <= 0) {
        in[z] = in2[x];
        x++;
      }
      else {
        in[z] = in2[y];
        y++;
      }
      z++;
    }

    while (x <= middle) {
      in[z] = in2[x];
      z++;
      x++;
    }
  }


  /**
   * Produces the name of the kind of sort implemented
   * @return the name of the sort algorithm
   */
  public String sortName() {
    return "MergedSort";
  }
}

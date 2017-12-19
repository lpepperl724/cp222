import java.util.*;

public class Stack<T> implements IStack<T> {

  private static final int defaultSize = 10;

  private int maxSize;
  private int top;
  private T [] listArray;

  Stack() {
    this(defaultSize);
  }
  @SuppressWarnings("unchecked")
  Stack(int size) {
    maxSize = size;
    top = 0;
    listArray = (T[]) new Object[size];
  }

  public void push(T v) throws OverFlowException {
    listArray[top++] = v;
  }

  public T pop() throws UnderFlowException {
    return listArray[--top];
  }

}

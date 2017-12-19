public class Queue<T> implements IQueue<T> {

  private static final int defaultSize = 10;

  private int maxSize;
  private int front;
  private int rear;
  private T[] listArray;

  Queue() {
    this(defaultSize);
  }
  @SuppressWarnings("unchecked")
  Queue(int size) {
    maxSize = size + 1;
    rear = 0; front = 1;
    listArray = (T[]) new Object[maxSize];
  }

  /**
   * Dequeues the Front element from the queue
   * @return dequeued element
   * @throws UnderFlowException if dequeueing an empty queue
   */
  public T dequeue() throws UnderFlowException {
    T v = listArray[front];
    return v;
  }

  /**
   * Enqueues an element at the back of the queue
   * @param v enqueued element
   * @throws OverFlowException if enqueueing a full queue
   */
  public void enqueue(T v) throws OverFlowException {
    listArray[rear] = v;
  }

}

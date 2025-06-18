import java.util.Stack;

public class QueueUsingStack {
  private Stack<Integer> first;
  private Stack<Integer> second;

  public QueueUsingStack() {
    first = new Stack<>();
    second = new Stack<>();
  }

  public void add(int item) {
    first.push(item);
  }

  public int remove() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }

    while (!first.isEmpty()) {
      second.push(first.pop());
    }
    int removed = second.pop();
    while (!second.isEmpty()) {
      first.push(second.pop());
    }
    return removed;
  }

  public int peek() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }

    while (!first.isEmpty()) {
      second.push(first.pop());
    }

    int peeked = second.peek();

    while (!second.isEmpty()) {
      first.push(second.pop());
    }
    return peeked;
  }

  public boolean isEmpty() {
    return first.isEmpty();
  }

  // Main method to test the queue functionality
  public static void main(String[] args) {
    try {
      QueueUsingStack queue = new QueueUsingStack();
      queue.add(10);
      queue.add(20);
      queue.add(30);

      System.out.println("Removed: " + queue.remove()); // Should print 10
      System.out.println("Peek: " + queue.peek());      // Should print 20
      System.out.println("Removed: " + queue.remove()); // Should print 20
      System.out.println("Is Empty? " + queue.isEmpty()); // Should print false
      System.out.println("Removed: " + queue.remove()); // Should print 30
      System.out.println("Is Empty? " + queue.isEmpty()); // Should print true

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}

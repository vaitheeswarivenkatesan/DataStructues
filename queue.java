public class Queue {
  int size = 5;
  int items[] = new int[size];
  int front, back;

  Queue() {
    front = -1;
    back = -1;
  }

  public  boolean isFull() {
    if (front == 0 && back == size- 1) {
      return true;
    }
    return false;
  }

 
 public boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }


  void addQueue(int val) {

    if (isFull()) {
      System.out.println("Queue is full");
    }
    else {
      if (front == -1) {
        front = 0;
      }

      back++;
      items[back] = val;
      System.out.println("Inserted " + val);
    }
  }

  int deleteQueue() {
    int val;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    }
    else {
      val = items[front];
      if (front >= back) {
        front = -1;
        back = -1;
      }
      else {
        front++;
      }
      System.out.println( val + " Deleted");
      return (val);
    }
  }

 
  void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    }
    else {
 
      System.out.println("Front" + front);

      System.out.println("elements are : ");
      for (i = front; i <= back; i++)
        System.out.print(items[i] + "  ");
      System.out.println("Back " + back);
    }
  }

  public static void main(String[] args) 
    Queue q = new Queue();

    q.deleteQueue();
    for(int i = 1; i < 6; i ++) {
      q.insertQueue(i);
    }

    q.insertQueue(6);

    q.display();

    q.deleteQueue();

    q.display();

  }
}


package queue_elaboration_app;


public class QueueADT {
    //required data fields
    int[] Queue;
    int size;
    int Front;
    int rear;

    //constructor
    QueueADT() {
        Front=0;
        rear=-1;

        Queue = new int[5];
    }

    //supporting methods
    //returns true if the stack is empty
    boolean isEmpty() {

        return rear == -1;

    }

    //returns true if the stack is full
    boolean isFull() {

        return Front ==0 && rear==Queue.length-1;

    }

    //push method
    void EnQueue(int a) {
        if (!isFull()) {

            rear++;
            Queue[rear] = a;

            System.out.print("Inserted to Queue: " + a);
        } else {
            System.out.println("Queue is Full");
        }
    }

    //pop method
    int DeQueue() {
        if (!isEmpty()) {

            int num;

            num = Queue[Front];

            Front++;

            System.out.println("DeQueued Element" + num);
            return num;

        } else {
            System.out.println("Queue is Empty");

            return -1;
        }

    }

    public void display(int[] st, int max_size) {
        int i;
        System.out.println("Queue Elements:");
        for (i = Front; i <= rear; i++) {
            System.out.print(st[i]+"|");
            System.out.println("");
        }
    }

}
    
    
    


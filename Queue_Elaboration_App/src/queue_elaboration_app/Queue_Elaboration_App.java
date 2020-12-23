
package queue_elaboration_app;
import java.util.Scanner;

public class Queue_Elaboration_App {

    public static void main(String[] args) {
        
          System.out.println("Program developed by: Jawad Amin");
        Scanner askme = new Scanner(System.in);

        
        
        QueueADT Queue = new QueueADT();

        //menu for this app
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("-------------Queue ELABORATION---------------");

        System.out.print("Enter 1 > Insert an element to Queue: \n");
        System.out.print("Enter 2 > DeQueue element from Queue: \n");
        System.out.print("Enter 3 > Display the current Queue: \n");
        System.out.print("Enter 4 > Exit the App: \n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int option;

        do {
            
            
            
            
            System.out.print("Enter your choice:");

            System.out.println("");

            option = askme.nextInt();

            System.out.println("");

            if (option == 1) {

                int number;
                System.out.print("Enter number to Enqueue: \n");
                number = askme.nextInt();

                Queue.EnQueue(number);

                System.out.println("");

            } else if (option == 2) {

                Queue.DeQueue();

            } else if (option == 3) {

                Queue.display(Queue.Queue,Queue.Front);
            }
        } while (option != 4);

        System.out.println("Program Terminated");
        
        
        
        
        
        
        
    }
    
}

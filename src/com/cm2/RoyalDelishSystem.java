package com.cm2;
import java.util.Scanner;

public class RoyalDelishSystem 
{
    static void MenuOption() 
    {
        System.out.println("\nROYAL DELISH QUEUE SYSTEM");
        System.out.println("1. Add Queue");
        System.out.println("2. Print Queue");
        System.out.println("3. Remove Queue and Massages");
        System.out.println("4. Order Report");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        QueueBuyer queue = new QueueBuyer();
        OrderList orders = new OrderList();

        int queueCounter = 0;

        int choice;

        do 
        { 
            MenuOption();
            System.out.print("Select menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                    queueCounter++;
                    
                    System.out.print("Buyer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Mobile Number: ");
                    String mobile = sc.nextLine();

                    Buyer b = new Buyer (queueCounter, name, mobile);
                    queue.enqueue(b);
                    break;

                case 2:
                    queue.printQueue();
                    break;

                case 3:
                    // System.out.print("Enter queue number to remove: ");
                    // int qNum = sc.nextInt();
                    // sc.nextLine();
                
                    // Buyer removed = queue.removeQueueByNumber(qNum);

                    // if (removed != null) 
                    // {
                    //     System.out.print("Order Code: ");
                    //     int code = sc.nextInt();
                    //     sc.nextLine();
                    //     System.out.print("Order Name: ");
                    //     String orderName = sc.nextLine();
                    //     System.out.print("Price: ");
                    //     int price = sc.nextInt();
                    //     sc.nextLine();

                    //     Order o = new Order(code, orderName, price);
                    //     orders.addOrder(o);

                    //     System.out.println(removed.name + " has ordered " + orderName);
                    // }

                    Buyer removed = queue.dequeue();

                    if (removed != null) 
                    {
                        System.out.print("Order Code: ");
                        int code = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Order Name: ");
                        String orderName = sc.nextLine();
                        System.out.print("Price: ");
                        int price = sc.nextInt();
                        System.out.print("Amount: ");
                        int amount = sc.nextInt();
                        sc.nextLine();

                        Order o = new Order(code, orderName, price, amount);
                        orders.addOrder(o);

                        System.out.println(removed.name + " has ordered " + orderName);
                        System.out.println("Total price: " + (amount * price));
                    }
                    break;

                case 4:
                    orders.printOrders();

                    OrderList total = new OrderList();
                    System.out.println("\nTotal Revenue: " + total.totalPrice());
                    break;

                case 0:
                    System.out.println("Thank You.");
                    sc.close();
                    break;

                default:
                    System.out.println("Invalid choice! Please Try Again!");
            }
        } 
        while (choice != 0);
    }
}

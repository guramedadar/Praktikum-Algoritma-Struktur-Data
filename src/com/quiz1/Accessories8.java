package com.quiz1;

class Accessories8 
{
    String name, 
           category;
    int price, 
        sold,
        stock,
        cheapPrice;

    Accessories8() 
    {

    }

    Accessories8(String name, String category, int price, int sold, int stock) 
    {
        this.name = name;
        this.category = category;
        this.price = price;
        this.sold = sold;
        this.stock = stock;
    }

    void display()
    {
        System.out.println("Name\t: " + this.name);
        System.out.println("Category\t: " + this.category);
        System.out.println("Price\t: Rp " + this.price);
        System.out.println("Sold\t: " + this.sold);
        System.out.println("Stock\t: " + this.stock);
        System.out.println("-------------------------");
    }

    int calculateTotalSales()
    {
        return this.price * this.sold;
    }

    void displayTotal()
    {
        System.out.println("Name\t: " + this.name);
        System.out.println("Category\t: " + this.category);
        System.out.println("Total price: " + calculateTotalSales());
        System.out.println("--------------------------");
    }

    void checkStock()
    {
        System.out.println("Name\t: " + this.name);
        System.out.println("Category\t: " + this.category);

        if (this.stock > 5) 
        {
            System.out.println("Stock: " + this.stock + " (Many Stock)");    
        }
        else
        {
            System.out.println("Stock:" + this.stock + " (Limited Stock)");
        }    

        System.out.println("--------------------------");
    }

    void searchCheapestAccessories()
    {
        
    }
}
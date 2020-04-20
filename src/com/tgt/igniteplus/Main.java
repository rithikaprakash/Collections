//OPERATIONS PERFOMED
//        PRINT MENU
//        LIST GROCERY ITEMS
//        ADD ITEMS
//        MODIFY GROCERY ITEMS
//        REMOVE THE ITEM FROM THE LIST
//        SEARCH ITEM IN THE LIST
//        QUIT APPLICATION

package com.tgt.igniteplus;

import com.tgt.igniteplus.GroceryStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static GroceryStore groceryList = new GroceryStore();

    public static void main(String[] args) {



        boolean quit= false;
        int choice;
        printMenu();
        while (quit!=true)
        {
            System.out.println("Enter the choice : ");
            choice =sc.nextInt();
            sc.nextLine();

           switch(choice)
           {
               case 0 :
                   printMenu();
                   break;

               case 1 :
                   groceryList.printGroceryItem();
                   break;

               case 2 :
                   addItems();
                   break;

               case 3:
                   modifyItem();
                   break;

               case 4 :
                   removeItem();
                   break;

               case 5 :
                   searchItem();
                   break;

               case 6 :
                   quit = true;
                   System.out.println("Process Ended ");
                   break;
           }
        }
    }
    public static void printMenu()
    {
        System.out.println(" 0.  \t Show the main menu ");
        System.out.println(" 1.  \t List the items  ");
        System.out.println(" 2.  \t Add items ");
        System.out.println(" 3.  \t Modify items in the list ");
        System.out.println(" 4.  \t Remove an item from the list  ");
        System.out.println(" 5.  \t To search an item in the list ");
        System.out.println(" 6.  \t To quit application ");
    }

    public static void addItems()
    {
        System.out.print("Enter the items : ");
        String itemAdd = sc.nextLine();
        groceryList.addGroceryItem(itemAdd);
    }

    public static void  modifyItem()
    {
        System.out.println("Enter the item number you wish to modify : ");
        int itemNo=sc.nextInt();
        sc.nextLine();
        System.out.println("The revised item is : ");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter the item you wish to remove");
        int  deleteItem= sc.nextInt();
        groceryList.removeGroceryItem(deleteItem-1);

    }
    public static void searchItem()
    {
        System.out.println("Enter the search item : ");
        String searchItemValue = sc.nextLine();
        if( groceryList.findItem(searchItemValue)!=null)
            System.out.println("Found ");
        else
            System.out.println("Not Found ");
    }
}

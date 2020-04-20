package com.tgt.igniteplus;

import java.util.ArrayList;

public class GroceryStore {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }

    public  void printGroceryItem()
    {
        System.out.println("You have "+groceryList.size()+" items in your grocery list ");
        for(int i=0;i<groceryList.size();i++)
        {
            System.out.println((i+1)+" , "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position,String newItem)
    {
        groceryList.set(position,newItem);
        System.out.println("Grocery item is present in "+position+" has been modified");
    }

    public void removeGroceryItem(int  position)
    {
//        String theItem=groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String searchItem)
    {
        int position = groceryList.indexOf(searchItem);
        if(position>=0)
        {
            return groceryList.get(position);
        }
        return null;
    }

}

package com.epam.CustomCollectionList;

import java.util.Scanner;

public class CustomListImplementation {

	public static void main(String[] args) throws Exception 
    {
        CustomList<Integer> list = new CustomList<Integer>();
 
        //Adding of elements into List
         list.add(1234);
         list.add(123);
         list.add(12);
         list.add(1);
       
         //printing the elements of List
         list.display();
         
         
         //Removing elements from List
         list.remove(3);
         list.remove(2);
         
          list.display();
         
         //fetching element from the list
         System.out.println(list.get(1));
         
         
         //getting the size of the list
         System.out.print(list.size());
    }
}

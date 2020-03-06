package com.epam.CustomCollectionList;


import java.util.Arrays;

public class CustomList<DataType> 
{
	private int size=0;
	private  static  int inital_capacity=10;
	private Object data[];
	
	//CustomListConstructor
   public CustomList()
   {
	   data=new Object[inital_capacity];
   }
   
   
   //To increase the capacity of customList Dynamically
   private void increaseCapacity()
   {
	   int newSize=data.length*2;
	   Arrays.copyOf(data, newSize);
   }
   
   
   // to get size
   public int size()
   {
	   return size;
   }
   //To add new elements
   public void add(DataType newelement)
   {
	   if(size==data.length)
		   increaseCapacity();
	   
	   data[size++]=newelement;
	   
   }
   
   
   //To fetch element from the list
   public DataType get(int indexOfElement) throws Exception
   {
	   if(indexOfElement>=size)
		  throw new Exception("Index"+indexOfElement+",size of List :"+size);
	   
	   return (DataType) data[indexOfElement];
   }
   
   
   //To remove element at given index
   
   public DataType remove(int indexOfElement) throws Exception {
       if (indexOfElement >= size) 
           throw new   Exception("Index: " + indexOfElement + ", Size of List:" + size);
     
       Object item = data[indexOfElement];
       int decreasedSize= data.length - ( indexOfElement + 1 ) ;
       System.arraycopy( data, indexOfElement + 1, data, indexOfElement,decreasedSize) ;
       size--;
       
       return (DataType) item;
   }
   
   
  
   public void display() 
   {
       String s=""; 
	   s="[";
        for(int i = 0; i < size ;i++) {
            s=s+data[i].toString();
            if(i<size-1){
                s=s+",";
            }
        }
        s=s+"]";
       System.out.println(s);
   }
}

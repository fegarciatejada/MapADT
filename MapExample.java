/**
* @author EMILIA BUTU
* version 1.0
* since   2020-06
*
* Student name:  Fernanda Garcia Camargo
* Completion date: 12/11/2020
*
* MapExample.txt: save the file as MapExample.java:
* Demonstrates the use of methods offered by MapInterface, with an implementation of the map using
* array lists.
*
* The file contains basic operations related to Map ADT
*
* Student tasks: complete tasks specified in the file
*/



public class MapExample
{
	public static void main(String[] args)
	{
		//*** Task #1: declare a variable of MapInterface type, with type of elements of your choice
		MapInterface<Integer, String> map;
		//*** Task #2: instantiate the variable declared above using the ArrayListMap constructor
		map=new ArrayListMap<>();
		//*** Task #3: check if the map is  empty, and print out the answer you get 
		System.out.println("Expect 'true' :"+map.isEmpty());
		//*** Task #4: use the appropriate method, and display the size of the map 
		System.out.println("Expect '0' :"+map.size());
		System.out.println("Expect 'null' :"+map.get(0));
		//*** Task #5: use the appropriate method to populate the map with 4-5 entries
		 map.put(1, "dog");
         map.put(2, "cat");
         map.put(3, "cow");
         map.put(4, "pig");
         map.put(5, "bird");
		//*** Task #6: check if the map is  empty, and print out the answer you get 
         System.out.println("Expect 'false' :"+map.isEmpty());
		//*** Task #7: use the appropriate method, and display the size of the map 
         System.out.println("Expect '5' :"+map.size());
		//*** Task #8: check if certain values belong to the map, and replace some of them
         if(map.contains(1))
         System.out.println("Expect 'dog' : "+map.get(1));
         System.out.println("Expect 'null' : "+map.get(8));        
         System.out.println("Expect 'cat' : "+map.get(2));
         if(map.contains(2))
             map.put(2,"ant");
     
     if(map.contains(5))
             map.put(5, "fox");
     
     if(map.contains(3))
             System.out.println("Expect 'cow' : "+map.get(3));
         
		//*** Task #9: display the content of the map 
     System.out.print("Expect 5 animals: ");
     for(MapEntry<Integer, String> m :map)
     {
             System.out.print(m.getValue()+" ");
     }
     System.out.println();
		//*** Task #10: remove a number of elements from the map
     System.out.println("Expect 'pig' :"+map.remove(4));
     System.out.println("Expect 'dog' :"+map.remove(1));
		//*** Task #11: display the new content of the map
     System.out.print("Expect 3 animals plus a 'null':");
     for(MapEntry<Integer, String> m :map)
     {
             System.out.print(m.getValue()+" ");
     }
     System.out.println(map.get(1));
	}
}
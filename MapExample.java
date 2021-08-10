

public class MapExample
{
	public static void main(String[] args)
	{
		
		MapInterface<Integer, String> map;
		
		map=new ArrayListMap<>();
		
		System.out.println("Expect 'true' :"+map.isEmpty());
		
		System.out.println("Expect '0' :"+map.size());
		System.out.println("Expect 'null' :"+map.get(0));
		
		 map.put(1, "dog");
         map.put(2, "cat");
         map.put(3, "cow");
         map.put(4, "pig");
         map.put(5, "bird");
		
         System.out.println("Expect 'false' :"+map.isEmpty());
		
         System.out.println("Expect '5' :"+map.size());
		
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
         
		
     System.out.print("Expect 5 animals: ");
     for(MapEntry<Integer, String> m :map)
     {
             System.out.print(m.getValue()+" ");
     }
     System.out.println();
		
     System.out.println("Expect 'pig' :"+map.remove(4));
     System.out.println("Expect 'dog' :"+map.remove(1));
		
     System.out.print("Expect 3 animals plus a 'null':");
     for(MapEntry<Integer, String> m :map)
     {
             System.out.print(m.getValue()+" ");
     }
     System.out.println(map.get(1));
	}
}

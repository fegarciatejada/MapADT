

import java.util.Iterator;

public interface MapInterface<K, V> extends Iterable<MapEntry<K,V>>
{
  V put(K k, V v);


  V get(K k);
  

  V remove(K k);


  boolean contains(K k);
 

  boolean isEmpty();
  

  boolean isFull();
  

  int size();
  
}

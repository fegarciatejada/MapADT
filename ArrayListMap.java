

import java.util.*; 

public class ArrayListMap<K, V>  implements MapInterface<K,V>
{
  protected ArrayList<MapEntry<K, V>> map;

  public ArrayListMap()
  {
    map = new ArrayList<MapEntry<K, V>>();
  }

  public ArrayListMap(int initCapacity)
  {
    map = new ArrayList<MapEntry<K, V>>(initCapacity);
  }

  public V put(K k, V v)

  {
    if (k == null)
      throw new IllegalArgumentException("Maps do not allow null keys.");

    MapEntry<K, V> entry = new MapEntry<K, V>(k, v);

    MapEntry<K,V> temp;
    Iterator<MapEntry<K,V>> search = map.iterator(); 
    while (search.hasNext())
    {
      temp = search.next();
      if (temp.getKey().equals(k))
      {
        search.remove();
        map.add(entry);
        return temp.getValue(); 
      }
    }

  
    map.add(entry);
    return null;
  }

  public V get(K k)
 
  {
    if (k == null)
      throw new IllegalArgumentException("Maps do not allow null keys.");

    for (MapEntry<K,V> temp: map)   
      if (temp.getKey().equals(k))
        return temp.getValue();     


    return null;
  }

  public V remove(K k)

  {
    if (k == null)
      throw new IllegalArgumentException("Maps do not allow null keys.");

    MapEntry<K,V> temp;
    Iterator<MapEntry<K,V>> search = map.iterator(); 
    while (search.hasNext())
    {
      temp = search.next();
      if (temp.getKey().equals(k))
      {
        search.remove();
        return temp.getValue();    d
      }
    }

    
    return null;
  }

  public boolean contains(K k)

  {
    if (k == null)
      throw new IllegalArgumentException("Maps do not allow null keys.");

    for (MapEntry<K,V> temp: map)
      if (temp.getKey().equals(k))
        return true;    

  
    return false;
  }

  public boolean isEmpty()
  
  {
    return (map.size() == 0);   
  }

  public boolean isFull()
  
  {
    return false;  
  }

  public int size()

  {
    return map.size();   
  }

  public Iterator<MapEntry<K,V>> iterator()
 
  {
    return map.iterator();  
  }
}

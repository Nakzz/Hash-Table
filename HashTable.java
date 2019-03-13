import java.util.ArrayList;

//
// TODO: implement all required methods
//
// TODO: describe the collision resolution scheme you have chosen
// identify your scheme as open addressing or bucket
//
// TODO: explain your hashing algorithm here
// NOTE: you are not required to design your own algorithm for hashing,
// since you do not know the type for K,
// you must use the hashCode provided by the <K key> object
// and one of the techniques presented in lecture
/**
 * The Class HashTable.
 * 
 * May use any of these Java's built-in Java collection types: 
 * Arrays, List, ArrayList, LinkedList, Stack, Queue (interface), PriorityQueue, Deque
 * 
 * May not use HashTable, TreeMap, HashMap, etc. 
 * May not add any public members to ADT or your
 * implementation.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
//
public class HashTable<K extends Comparable<K>, V> implements HashTableADT<K, V> {

  // TODO: ADD and comment DATA FIELD MEMBERS needed for your implementation
  private int capacity;
  private int size;
  private double loadFactorThreshold;
  private ArrayList<HashNode<K,V>> datastructure;
  
  /**
   * Instantiates a new hash table.
   * Starting with a capacity of 11 and threashold of 75% as default parameters.
   */
  public HashTable() {
this.capacity =11;
this.loadFactorThreshold = .75;
this.datastructure = new ArrayList<HashNode<K,V>>(this.capacity);
  }

  /**
   * Instantiates a new hash table. 
   * The initial capacity must be a positive integer
   *
   * @param initialCapacity the initial capacity
   * @param loadFactorThreshold the load factor threshold
   */
  // threshold is the load factor that causes a resize and rehash
  public HashTable(int initialCapacity, double loadFactorThreshold) {
this.capacity = initialCapacity;
this.loadFactorThreshold = loadFactorThreshold;
this.datastructure = new ArrayList<HashNode<K,V>>(this.capacity);
  }
  
  /**
   * Computes for hashIndex using a hash function. TODO:The Algorithm for the hash function is 
   * @param key
   * @return
   */
  private int getHashIndex(K key) {
    
    //TODO: finish function
    
    return 0;
    
  }
  
  /**
   * rehash 
   */
  private void expandDS() {
    
    //TODO: finish function
    
  }
  
  

  /**
   * Add the key,value pair to the data structure and increase the number of keys. If key is null,
   * throw IllegalNullKeyException; If key is already in data structure, throw
   * DuplicateKeyException();
   *
   * @param key the key
   * @param value the value
   * @throws IllegalNullKeyException the illegal null key exception
   * @throws DuplicateKeyException the duplicate key exception
   */
  @Override
  public void insert(K key, V value) throws IllegalNullKeyException, DuplicateKeyException {
    if (key == null)
      throw new IllegalNullKeyException();

    if (this.contains(key))
      throw new DuplicateKeyException();

    
  //if loadFactor is larger than threshold, expandCapacity
    if(this.loadFactorThreshold <= this.getLoadFactor()) {
      expandDS();
    }
    
    
    HashNode<K, V> node = new HashNode<K, V>(key, value, null);
    
    //insert by getting hashing index
    int hashIndex = getHashIndex(key);
    
    if(datastructure.get(hashIndex) == null) { // if first element
      datastructure.add(hashIndex, node);
    } else { // if collision occurs
      
      HashNode<K, V> nextNode = datastructure.get(hashIndex);
      
      while(nextNode != null){
        nextNode = nextNode.getNext();
      }
      
      nextNode.setNext(node);
      
    }
     
    // increment size 
    this.size++;
    
  }

  /**
   * /**
   * Returns true if the key is in the data structure. Returns false if key is not null and is not
   * present
   * 
   * Assuming Key is not null
   * 
   * @param key
   * @return if key contains in DS or not
   */
  private boolean contains(K key) {
    int hashIndex = getHashIndex(key);
    
    HashNode<K, V> node= datastructure.get(hashIndex);
    
    if(node == null) {
      return false;
    } else if ( node.getKey().compareTo(key) == 0) { // found match
      return true;
    } else {
      // if buckets contain
      
  HashNode<K, V> nextNode = node;
      
      while(nextNode != null){
        nextNode = nextNode.getNext();
        if ( nextNode.getKey().compareTo(key) == 0) { // found match
          return true;
        }
        
      }
    }
    
    return false;
  }

  /**
   * If key is found, remove the key,value pair from the data structure decrease number of keys.
   * return true If key is null, throw IllegalNullKeyException If key is not found, return false
   *
   * @param key the key
   * @return true, if successful
   * @throws IllegalNullKeyException the illegal null key exception
   */
  @Override
  public boolean remove(K key) throws IllegalNullKeyException {
    // TODO Auto-generated method stub
    return false;
  }

  /**
   * Returns the value associated with the specified key Does not remove key or decrease number of
   * keys
   * 
   * If key is null, throw IllegalNullKeyException If key is not found, throw KeyNotFoundException().
   *
   * @param key the key
   * @return the v
   * @throws IllegalNullKeyException the illegal null key exception
   * @throws KeyNotFoundException the key not found exception
   */
  @Override
  public V get(K key) throws IllegalNullKeyException, KeyNotFoundException {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Returns the number of key,value pairs in the data structure.
   *
   * @return the int
   */
  @Override
  public int numKeys() {
    return this.size;
  }


  /**
   * Returns the load factor threshold that was passed into the constructor when creating the instance
   * of the HashTable. When the current load factor is greater than or equal to the specified load
   * factor threshold, the table is resized and elements are rehashed.
   *
   * @return the load factor threshold
   */
  @Override
  public double getLoadFactorThreshold() {
    return this.loadFactorThreshold;
  }

  /**
   * Returns the current load factor for this hash table load factor = number of items / current table
   * size.
   *
   * @return the load factor
   */
  @Override
  public double getLoadFactor() {
    return this.size/this.capacity;
  }


  /**
   * Return the current Capacity (table size) of the hash table array.
   * 
   * The initial capacity must be a positive integer, 1 or greater and is specified in the
   * constructor.
   * 
   * REQUIRED: When the load factor threshold is reached, the capacity must increase to: 2 * capacity
   * + 1
   * 
   * Once increased, the capacity never decreases
   *
   * @return the capacity
   */
  @Override
  public int getCapacity() {
    return this.capacity;
  }

  /**
   * Returns the collision resolution scheme used for this hash table. Implement with one of the
   * following collision resolution strategies. Define this method to return an integer to indicate
   * which strategy.
   * 
   * 1 OPEN ADDRESSING: linear probe 
   * 2 OPEN ADDRESSING: quadratic probe 
   * 3 OPEN ADDRESSING: double
   * hashing 4 CHAINED BUCKET: array of arrays 5 CHAINED BUCKET: array of linked nodes 6 CHAINED
   * BUCKET: array of search trees 7 CHAINED BUCKET: linked nodes of arrays 8 CHAINED BUCKET: linked
   * nodes of linked node 9 CHAINED BUCKET: linked nodes of search trees
   *
   * @return the collision resolution
   */
  @Override
  public int getCollisionResolution() {
    return 5; // using linked nodes within arraylist
  }


}

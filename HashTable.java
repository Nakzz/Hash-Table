
// TODO: comment and complete your HashTableADT implementation
// DO ADD UNIMPLEMENTED PUBLIC METHODS FROM HashTableADT and DataStructureADT TO YOUR CLASS
// DO IMPLEMENT THE PUBLIC CONSTRUCTORS STARTED
// DO NOT ADD OTHER PUBLIC MEMBERS (fields or methods) TO YOUR CLASS
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
//
public class HashTable<K extends Comparable<K>, V> implements HashTableADT<K, V> {

  // TODO: ADD and comment DATA FIELD MEMBERS needed for your implementation

  // TODO: comment and complete a default no-arg constructor
  public HashTable() {

  }

  // TODO: comment and complete a constructor that accepts
  // initial capacity and load factor threshold
  // threshold is the load factor that causes a resize and rehash
  public HashTable(int initialCapacity, double loadFactorThreshold) {

  }

  /**
   * 
   * Add the key,value pair to the data structure and increase the number of keys. If key is null,
   * throw IllegalNullKeyException; If key is already in data structure, throw
   * DuplicateKeyException();
   */
  @Override
  public void insert(K key, V value) throws IllegalNullKeyException, DuplicateKeyException {
    // TODO Auto-generated method stub

  }

  /**
   * If key is found, remove the key,value pair from the data structure decrease number of keys.
   * return true If key is null, throw IllegalNullKeyException If key is not found, return false
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
   */
  @Override
  public V get(K key) throws IllegalNullKeyException, KeyNotFoundException {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Returns the number of key,value pairs in the data structure
   */
  @Override
  public int numKeys() {
    // TODO Auto-generated method stub
    return 0;
  }


  /**
   * Returns the load factor threshold that was passed into the constructor when creating the instance
   * of the HashTable. When the current load factor is greater than or equal to the specified load
   * factor threshold, the table is resized and elements are rehashed.
   */
  @Override
  public double getLoadFactorThreshold() {
    // TODO Auto-generated method stub
    return 0;
  }

  /**
   * Returns the current load factor for this hash table load factor = number of items / current table
   * size
   */
  @Override
  public double getLoadFactor() {
    // TODO Auto-generated method stub
    return 0;
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
   */
  @Override
  public int getCapacity() {
    // TODO Auto-generated method stub
    return 0;
  }

  /**
   * Returns the collision resolution scheme used for this hash table. Implement with one of the
   * following collision resolution strategies. Define this method to return an integer to indicate
   * which strategy.
   * 
   * 1 OPEN ADDRESSING: linear probe 2 OPEN ADDRESSING: quadratic probe 3 OPEN ADDRESSING: double
   * hashing 4 CHAINED BUCKET: array of arrays 5 CHAINED BUCKET: array of linked nodes 6 CHAINED
   * BUCKET: array of search trees 7 CHAINED BUCKET: linked nodes of arrays 8 CHAINED BUCKET: linked
   * nodes of linked node 9 CHAINED BUCKET: linked nodes of search trees
   */
  @Override
  public int getCollisionResolution() {
    // TODO Auto-generated method stub
    return 0;
  }


}

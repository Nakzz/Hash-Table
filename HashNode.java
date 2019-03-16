
/**
 * Title: HashNode
 * Course: CS400, Spring 2019 
 * Author: Ajmain Naqib 
 * Email: naqib@wisc.edu Lecturer's
 * Name: Deb Deppeler
 * 
 */

/**
 * The Class HashNode.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
class HashNode<K, V> {

  /** The key. */
  K key;
  
  /** The value. */
  V value;
  
  /** The next. */
  HashNode<K, V> next;



  /**
   * Instantiates a new hash node.
   *
   * @param key the key
   * @param value the value
   * @param next the next
   */
  HashNode(K key, V value, HashNode<K, V> next) {
    this.key = key;
    this.value = value;
    this.next = next;
  }

  /**
   * Instantiates a new hash node.
   *
   * @param key the key
   * @param value the value
   */
  HashNode(K key, V value) {
    this(key, value, null);
  }

  /**
   * Gets the key.
   *
   * @return the key
   */
  protected K getKey() {
    return this.key;
  }

  /**
   * Gets the next.
   *
   * @return the next
   */
  protected HashNode<K, V> getNext() {
    
    return this.next;
  }
  
  protected void setNext(HashNode<K, V> next){
    this.next = next;
  }
}

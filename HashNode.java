// TODO: Auto-generated Javadoc
//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: BSTNODE
// Course: CS400, Spring 2019
//
// Author: Ajmain Naqib
// Email: naqib@wisc.edu
// Lecturer's Name: Deb Deppeler
//
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: None
// Online Sources: None
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

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

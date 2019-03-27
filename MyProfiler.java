/**
 * Filename:   MyProfiler.java
 * Project:    p3b-201901     
 * Authors:    Ajmain Naqib, LEC 002
 *
 * Semester:   Spring 2019
 * Course:     CS400
 * 
 * Due Date:   10:00 PM March 28th 2019 
 * Version:    1.0
 * 
 * Credits:    TODO: name individuals and sources outside of course staff
 * 
 * Bugs:       TODO: add any known bugs, or unsolved problems here
 */

import java.util.TreeMap;


/**
 * The Class MyProfiler used as the data structure to test our hash table against
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public class MyProfiler<K extends Comparable<K>, V> {

    /** The hashtable. */
    HashTableADT<K, V> hashtable;
    
    /** The treemap. */
    TreeMap<K, V> treemap;
    
    /**
     * Instantiates a new my profiler.
     */
    public MyProfiler() {
        // Instantiate your HashTable and Java's TreeMap
      this.hashtable = (HashTableADT<K, V>) new HashTable<Integer, String>();
      this.treemap = new TreeMap<K, V>();
    }
    
    /**
     * Insert K, V into both data structures.
     *
     * @param key the key
     * @param value the value
     */
    public void insert(K key, V value) {
      try {
        this.hashtable.insert(key, value);
       
      } catch (IllegalNullKeyException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (DuplicateKeyException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
      this.treemap.put(key, value);
    }
    
    /**
     * Retrieve value V for key K from data structures.
     *
     * @param key the key
     */
    public void retrieve(K key) {
      try {
        this.hashtable.get(key);
      } catch (IllegalNullKeyException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (KeyNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
      this.treemap.get(key);
    }
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        try {
            int numElements = Integer.parseInt(args[0]);

            // Create a profile object. 
            // For example, Profile<Integer, Integer> profile = new Profile<Integer, Integer>();
            MyProfiler<Integer, Integer> profile = new MyProfiler<Integer, Integer>();
            
            // execute the insert method of profile as many times as numElements
            for (long i = 0; i < numElements; i++) {
              profile.insert((int)i, (int)i);
          }
            
            // execute the retrieve method of profile as many times as numElements
            
            for (long i = 0; i < numElements; i++) {
              profile.retrieve((int)i); 
          }
            
            // See, ProfileSample.java for example.
            
        
            String msg = String.format("Inserted and retreived %d (key,value) pairs", numElements);
            System.out.println(msg);
        }
        catch (Exception e) {
            System.out.println("Usage: java MyProfiler <number_of_elements>");
            System.exit(1);
        }
    }
}

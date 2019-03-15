import static org.junit.jupiter.api.Assertions.*; // org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * TODO: add class header comments here.
 */
public class HashTableTest {

  HashTable<Integer, String> htIntegerKey;
  private static Random random = new Random();
  private static final int LIMIT = 1000;

  /**
   * Sets the up.
   *
   * @throws Exception the exception
   */

  @Before
  public void setUp() throws Exception {
    htIntegerKey = new HashTable<Integer, String>();
  }

  /**
   * Tear down.
   *
   * @throws Exception the exception
   */

  @After
  public void tearDown() throws Exception {
    htIntegerKey = null;
  }

  /**
   * Tests that a HashTable returns an integer code indicating which collision resolution strategy is
   * used. REFER TO HashTableADT for valid collision scheme codes.
   */
  @Test
  public void test000_collision_scheme() {

    int scheme = htIntegerKey.getCollisionResolution();
    if (scheme < 1 || scheme > 9)
      fail("collision resolution must be indicated with 1-9");
  }

  /**
   * Tests that insert(null,null) throws IllegalNullKeyException.
   */
  @Test
  public void test001_IllegalNullKey() {
    try {
      htIntegerKey.insert(null, null);
      fail("should not be able to insert null key");
    } catch (IllegalNullKeyException e) {
      /* expected */ } catch (Exception e) {
      fail("insert null key should not throw exception " + e.getClass().getName());
    }
  }

  /**
   * Tests that inserting one element works properly
   * 
   */
  @Test
  public void test002_insertOne() {
    try {
      htIntegerKey.insert(10, "First Insert");

    } catch (Exception e) {
      fail("insert should not throw exception " + e.getClass().getName());
    }

    if (htIntegerKey.numKeys() != 1) {
      fail("insert key increase number of keys ");
    }
  }

  /**
   * Tests that inserting multiple elements resizes the DS to proper insert
   * 
   */
  @Test
  public void test003_insertMany() {
    try {
      for (int i = 0; i < 20; i++) {
        htIntegerKey.insert(i, "Multi Insert");
      }


    } catch (Exception e) {
      fail("insert should not throw exception " + e.getClass().getName());
    }

    if (htIntegerKey.numKeys() != 20) {
      fail("insert key increase number of keys ");
    }
  }

  /**
   * Tests the single removing functionality of the program
   * 
   */
  @Test
  public void test004_removeOne() {
    try {
      test003_insertMany();

      htIntegerKey.remove(1);
    } catch (Exception e) {
      fail("remove should not throw exception " + e.getClass().getName());
    }

    try {
      if (htIntegerKey.get(1) != null)
        fail("Key 1 still exsists");
    } catch (IllegalNullKeyException e) {
      fail("remove should not throw exception " + e.getClass().getName());
      e.printStackTrace();
    } catch (KeyNotFoundException e) {
      // pass
    }
  }

  /**
   * Tests the functionality of removing buckets
   * 
   */
  @Test
  public void test005_removeBuckets() {
    int CAPACITY = 300;

    List<Integer> elements = new ArrayList<Integer>();


    for (int i = 0; i < 3 * CAPACITY; i++) {
      Integer key = getRandom();
      if (!elements.contains(key)) {
        elements.add(key);
        try {
           System.out.println(" trying to insert key:" + key);
          htIntegerKey.insert(key, "Chain insert: " + key);

        } catch (IllegalNullKeyException e) {
          //pass
          e.printStackTrace();
        } catch (DuplicateKeyException e) {
          //pass
//           e.printStackTrace();
        } catch (Exception e) {
          fail("insert should not throw exception " + e.getClass().getName());
        }

      } else {
        System.out.println(" Already inserted: " + key);
      }
    }

    for (int i=0; i< elements.size(); i++) {
      Integer element = elements.get(i);
      System.out.println("  Removing key:" + element);
      try {
        
        htIntegerKey.remove(element);

        if (htIntegerKey.contains(element))
          fail("Key still exsists: " + element);

      } catch (IllegalNullKeyException e) {
        fail("remove should not throw exception " + e.getClass().getName());
        e.printStackTrace();
      }
    }

    if (htIntegerKey.numKeys() != 0)
      fail("Size should be zero ");

  }


  /**
   * Tests if argConstructor has correct functionality 
   * 
   */
   @Test
  public void test009_argConstructor() {
    try {
      htIntegerKey = new HashTable<Integer, String>(300, .60);
      assertTrue(htIntegerKey.getCapacity() == 300);
      
      test003_insertMany();
      
      htIntegerKey.insert(999, "Last element");
      
      
      assertTrue(htIntegerKey.getLoadFactor() <= .60);
      
    } catch (IllegalNullKeyException e) {

      fail("should not be able to insert null key");
       } catch (Exception e) {
      fail("insert null key should not throw exception " + e.getClass().getName());
    }
    
    
  }


  /**
   * TODO: fix IMPLEMENTED AS EXAMPLE FOR YOU
   * 
   */
  // @Test
  public void test010_rehash() {
    try {
      htIntegerKey.insert(null, null);
      fail("should not be able to insert null key");
    } catch (IllegalNullKeyException e) {
      /* expected */ } catch (Exception e) {
      fail("insert null key should not throw exception " + e.getClass().getName());
    }
  }

  /**
   * TODO: fix IMPLEMENTED AS EXAMPLE FOR YOU load factor .5
   * 
   */
  // @Test
  public void test011_expandingWithMinArgument() {
    try {
      htIntegerKey.insert(null, null);
      fail("should not be able to insert null key");
    } catch (IllegalNullKeyException e) {
      /* expected */ } catch (Exception e) {
      fail("insert null key should not throw exception " + e.getClass().getName());
    }
  }

  /**
   * TODO: fix IMPLEMENTED AS EXAMPLE FOR YOU
   * 
   */
  // @Test
  public void test012_contains() {
    try {
      htIntegerKey.insert(null, null);
      fail("should not be able to insert null key");
    } catch (IllegalNullKeyException e) {
      /* expected */ } catch (Exception e) {
      fail("insert null key should not throw exception " + e.getClass().getName());
    }
  }

  /**
   * Tests the single removing functionality of the program
   * 
   */
  @Test
  public void test0013_removeMany() {
    try {
      test003_insertMany();
      htIntegerKey.insert(40, null);
      
      for (int i = 0; i < 20; i++) {
        htIntegerKey.remove(i);
      }

    } catch (Exception e) {
      fail("remove should not throw exception " + e.getClass().getName());
    }

    try {
      for (int i = 0; i < 20; i++) {
        if (htIntegerKey.get(i) != null)
          fail("Key still exsists");
      }
     
        
    } catch (IllegalNullKeyException e) {
      fail("remove should not throw exception " + e.getClass().getName());
      e.printStackTrace();
    } catch (KeyNotFoundException e) {
      // pass
    }
    
//    
//    assertTrue(hashTable.remove(found));  // remove the element
//    assertFalse(hashTable.remove(found)); // confirm removal
//
//
//assertTrue(hashTable.getSize() == 0);
  }

  /**
   * Tests the functionality of chain inserts
   * 
   */
  @Test
  public void test014_randomChainInsert() {
    int CAPACITY = 900;



    for (int i = 0; i < 3 * CAPACITY; i++) {
      Integer key = getRandom();
      try {
        // System.out.println(" trying to insert key:" + key);
        htIntegerKey.insert(key, "Chain insert: " + key);

      } catch (IllegalNullKeyException e) {
        fail("insert should not throw null exception " + e.getClass().getName());
        e.printStackTrace();
      } catch (DuplicateKeyException e) {

        // e.printStackTrace();
      } catch (Exception e) {
        fail("insert should not throw exception " + e.getClass().getName());
      }

    }


  }


  /**
   * Tests the functionality of chain inserts
   * 
   */
  @Test
  public void test014_ChainInsert() {


    List<Integer> elements = new ArrayList<Integer>();

    elements.add(21);
    elements.add(32);
    elements.add(43);
    for (int i=0; i< elements.size(); i++) {
      Integer element = elements.get(i);
      try {
        System.out.println("  trying to insert key:" + element);
        htIntegerKey.insert(element, "Chain insert: " + element);
        
        assertTrue(htIntegerKey.contains(element));

      } catch (IllegalNullKeyException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (DuplicateKeyException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (Exception e) {
        fail("insert should not throw exception " + e.getClass().getName());
      }

    }


  }



  private static int getRandom() {
    return random.nextInt(LIMIT);
  }



  // must be generic type - should be able to instantiate with String, Integer, Float, etc.
  // must handle edge or corner cases (first, last, empty, full)
  // must handle collisions (you can choose how, but must be one of the way presented in lecture)
  // must handle resizing (we will set the initial capacity "table size" and add enough to cause
  // re-sizing)


}

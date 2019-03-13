// TODO: add imports as needed

import static org.junit.jupiter.api.Assertions.*; // org.junit.Assert.*; 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 *  TODO: add class header comments here.
 */
public class HashTableTest{

    // TODO: add other fields that will be used by multiple tests
  HashTable<Integer, String> htIntegerKey;
    
    /**
     * Sets the up.
     *
     * @throws Exception the exception
     */
    // TODO: add code that runs before each test method
    @Before
    public void setUp() throws Exception {
      htIntegerKey = new HashTable<Integer, String>();
    }

    /**
     * Tear down.
     *
     * @throws Exception the exception
     */
    // TODO: add code that runs after each test method
    @After
    public void tearDown() throws Exception {
      htIntegerKey = null;
    }
    
    /** 
     * Tests that a HashTable returns an integer code
     * indicating which collision resolution strategy 
     * is used.
     * REFER TO HashTableADT for valid collision scheme codes.
     */
    @Test
    public void test000_collision_scheme() {

        int scheme = htIntegerKey.getCollisionResolution();
        if (scheme < 1 || scheme > 9) 
            fail("collision resolution must be indicated with 1-9");
    }
        
    /**
     * TODO: fix IMPLEMENTED AS EXAMPLE FOR YOU
     * Tests that insert(null,null) throws IllegalNullKeyException.
     */
    @Test
    public void test001_IllegalNullKey() {
        try {
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
    /**
     *TODO: fix  IMPLEMENTED AS EXAMPLE FOR YOU
     * 
     */
    @Test
    public void test002_insertOne() {
        try {
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
    /**
     *TODO: fix  IMPLEMENTED AS EXAMPLE FOR YOU
     * 
     */
    @Test
    public void test003_insertMany() {
        try {
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
    /**
     *TODO: fix  IMPLEMENTED AS EXAMPLE FOR YOU
     * 
     */
    @Test
    public void test004_removeOne() {
        try {
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
    /**
     *TODO: fix  IMPLEMENTED AS EXAMPLE FOR YOU
     * 
     */
    @Test
    public void test005_removeMany() {
        try {
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
    /**
     *TODO: fix  IMPLEMENTED AS EXAMPLE FOR YOU
     * 
     */
    @Test
    public void test006_get() {
        try {
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
    
    /**
     *TODO: fix  IMPLEMENTED AS EXAMPLE FOR YOU
     * 
     */
    @Test
    public void test007_loadFactor() {
        try {
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
    /**
     *TODO: fix  IMPLEMENTED AS EXAMPLE FOR YOU
     * 
     */
    @Test
    public void test008_getCapacity() {
        try {
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
    
    
    /**
     *TODO: fix  IMPLEMENTED AS EXAMPLE FOR YOU
     * 
     */
    @Test
    public void test009_argConstructor() {
        try {
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
    
    /**
     *TODO: fix  IMPLEMENTED AS EXAMPLE FOR YOU
     * 
     */
    @Test
    public void test010_rehash() {
        try {
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
//    must be generic type - should be able to instantiate with String, Integer, Float, etc.
//    must handle edge or corner cases (first, last, empty, full)
//    must handle collisions (you can choose how, but must be one of the way presented in lecture) 
//    must handle resizing (we will set the initial capacity "table size" and add enough to cause re-sizing)

    
}

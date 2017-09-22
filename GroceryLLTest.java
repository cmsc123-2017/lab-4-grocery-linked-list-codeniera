import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class GroceryLLTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  
  
  /*
   * 
    GroceryListLinked list = new GroceryListLinked();   
    GroceryItem a = new GroceryItem("appa", 1);
    GroceryItem b = new GroceryItem("bappa", 12);
    GroceryItem c = new GroceryItem("cappa", 13);
    GroceryItem d = new GroceryItem("dappa", 3);
    list.add(a);
    list.add(b);
    list.add(c);
    list.add(d);
   * 
   * 
   */
  
  public void testadd() {
    
    
    GroceryListLinked list = new GroceryListLinked();
    GroceryItem a = new GroceryItem("appa", 94);
    
    assertEquals(list.size, 0);
    
    list.add(a);
    
    
    assertEquals(list.size, 1);
    
    
    assertEquals(list.head.data.name ,"appa");
    
  }
  
  public void testmarkAsBought(){
    
    GroceryListLinked list = new GroceryListLinked();   
    GroceryItem a = new GroceryItem("appa", 1);
    GroceryItem b = new GroceryItem("bappa", 12);
    
    list.add(a);
    list.add(b);
    
    assertFalse(list.head.data.isBought);
    
    list.markAsBought("bappa");
    
    assertTrue(list.head.data.isBought);
  }
  
  public void testremove() {
  
    GroceryListLinked list = new GroceryListLinked();   
    GroceryItem a = new GroceryItem("appa", 1);
    GroceryItem b = new GroceryItem("bappa", 12);
    GroceryItem c = new GroceryItem("cappa", 13);
    GroceryItem d = new GroceryItem("dappa", 3);
  
    list.add(a);
    list.add(b);
    list.add(c);
    list.add(d);
  
    assertEquals(list.size, 4);
    list.remove("dappa");
    assertEquals(list.size, 3);
    list.remove("bappa");
    assertEquals(list.size, 2);
    list.remove("appa");
    assertEquals(list.size, 1);
  }
  
}

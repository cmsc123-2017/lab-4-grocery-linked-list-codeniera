//Implement the grocery list as a linked list! Implement these methods following the design recipe (be sure to include JUnit tests for each method!):
//
//add - adds an item to the top of the grocery list
//remove(String name)
//markAsBought(String name)
//display()
//You may use your previously defined interface IGroceryList, but provide stubs for the functions you're not implementing yet.
//
//Note: can you reuse tests you created previously for the ArrayList implementation?



class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  GroceryNode prev = null;
  int size = 0;
  
  GroceryListLinked(){}
  
  public boolean add(GroceryItem item) {
    
    GroceryNode juan = new GroceryNode(item, head);
    head = juan;
   
    
    size++;
    return true;
  }
  
  public boolean remove(String name) {
    if(isNamed(name) == null || size == 0)
      return false;
    if(isNamed(name) == head){
      head = head.next;
    }
    else{
      GroceryNode juan = isNamed(name).next;
      prev.next = juan;
    }
    size--;
    return true;
  }
  
  public boolean markAsBought(String name) {
   
   if(isNamed(name) == null)
      return false;
   isNamed(name).data.bought();
   return true;
    
  }
  
  public void display() {
    
    GroceryNode juan = head;
    while(juan != null){
      System.out.println(juan.data);
      juan = juan.next;
    }
  }
  
  public GroceryNode isNamed(String name){
    
    GroceryNode juan = head;
    while(!(juan.data.equals(new GroceryItem(name, 0)))){
      
      if(juan.next==null){
        System.out.println("Not in List");
        return null;
      }
      prev = juan;
      juan = head.next;
      
  }
    return juan;
  }
}

class GroceryNode {
  GroceryItem data;
  GroceryNode next;
  
  GroceryNode(GroceryItem data, GroceryNode next) {
    this.data = data;
    this.next = next;
  }
  
  public String toString(){
     return this.data.toString();
  }
  
}
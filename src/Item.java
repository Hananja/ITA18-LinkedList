/**
 * Class Item
 */
public class Item {

  //
  // Fields
  //

  private String data;
  private Item next;
  
  //
  // Constructors
  //
  public Item () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of data
   * @param newVar the new value of data
   */
  public void setData(String newVar) {
    data = newVar;
  }

  /**
   * Get the value of data
   * @return the value of data
   */
  public String getData ( ) {
    return data;
  }

  //
  // Other methods
  //

  /**
   * @return       Item
   */
  public Item getNext(  )
  {
    return this.next;
  }


  /**
   * @param        next
   */
  public void setNext( Item next )
  {
    this.next = next;
  }

}

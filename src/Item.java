/**
 * Class Item encapsulates a list entry item
 */
public class Item {

  private String data;
  private Item next;
  
  public Item () { }

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

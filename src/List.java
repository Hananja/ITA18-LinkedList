/**
 * Class List
 */
public class List {

  //
  // Fields
  //

  private Item current;
  private Item head;
  
  //
  // Constructors
  //
  public List () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of m_current
   * @param newVar the new value of m_current
   */
  private void setCurrent ( Item newVar ) {
    current = newVar;
  }

  /**
   * Get the value of m_current
   * @return the value of m_current
   */
  private Item getCurrent ( ) {
    return current;
  }

  /**
   * Set the value of m_head
   * @param newVar the new value of m_head
   */
  private void setHead ( Item newVar ) {
    head = newVar;
  }

  /**
   * Get the value of m_head
   * @return the value of m_head
   */
  private Item getHead ( ) {
    return head;
  }

  //
  // Other methods
  //

  /**
   * @param        data
   */
  public void insert( String data )
  {
  }


  /**
   * @param        data
   */
  public void append( String data )
  {
  }


  /**
   */
  public void delete(  )
  {
  }


  /**
   */
  public void rewind(  )
  {
  }


  /**
   * @return       String
   */
  public String getNext(  )
  {
    return null;
  }

}

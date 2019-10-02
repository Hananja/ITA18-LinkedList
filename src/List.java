/**
 * Class List encapsulates a list of Items.
 */
public class List {

  private Item current;
  private Item head;
  
  public List () { };
  
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
   * Get the value of m_head
   * @return the value of m_head
   */
  private Item getHead ( ) {
    return head;
  }

  /**
   * @param        data Data to store
   */
  public void insert( String data )
  {
  }


  /**
   * @param        data Data to store
   */
  public void append( String data )
  {
    Item item = new Item(); // neues Item Objekt für die Liste
    item.setData(data);     // Daten in Objekt ablegen
    item.setNext(null);     // Item hat keinen Nachfolger

    if( head == null ) { // Sonderfall: leere Liste?
      head = item;
    } else {
      // Bedingung: tmp.getNext() == null
      Item tmp = head; // Start der Liste in tmp sichern
      while (tmp.getNext() != null) { // letztes Element?
        tmp = tmp.getNext(); // nächstes Element auswählen
      }
      tmp.setNext(item);
    }
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
      current = head;
  }


}

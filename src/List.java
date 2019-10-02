/**
 * Class List encapsulates a list of Items.
 */
public class List {

  private Item current;
  private Item head;
  
  public List () { };
  
  /**
   * Set the value of current
   * @param newVar the new value of current
   */
  private void setCurrent ( String newVar ) {
    current.setData(newVar);
  }

  /**
   * Get the value of current
   * @return the value of current
   */
  public String getCurrent ( ) {
    if( current != null) {
      return current.getData();
    } else {
      return null;
    }
  }

  /**
   * Get the value of head
   * @return the value of head
   */
  public Item getHead ( ) {
    return head;
  }

  /**
   * Insert Item at beginning of list
   * @param        data Data to store
   */
  public void insert( String data )
  {
    Item item = new Item();
    item.setData(data);
    item.setNext(head);
    head = item;
  }


  /**
   * Append item to list at the end
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
   * Delete current item.
   */
  public void delete(  )
  {
      // TODO
  }


  /**
   * Rewinds the list by setting current to head.
   */
  public void rewind(  )
  {
      current = head;
  }


  /**
   * Delete item, that is successor of current
   */
  public void deleteNext() {
    if (current != null && current.getNext() != null) {
      current.setNext(current.getNext().getNext());
    }
  }

  /**
   * Delete first item of list
   */
  public void deleteFirst() {
    if( head != null ) {
      head = head.getNext();
    }
  }

  /**
   * Set current to next item
   */
  public void step() {
   if(current != null) {
     current = current.getNext();
   }
  }

}

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class AddressBook here.
 *
 * @author Mr. King
 * @version 2/8/2022
 */
public class AddressBook
{
    private List<Contact> book;
    
    /**
     * Constructs AddressBook object (initializes List as an ArrayList)
     */
    public AddressBook()
    {
        book = new ArrayList<Contact>();
    }
    
    /**
     *
     * @param c
     *
     * Add Contact c into this AddressBook (alphabetically)
     */
    public void add(Contact c)
    {
        int i = 0;
        while(book.size() > 0 && c.getLastName().compareTo(book.get(i).getLastName()) > 0) {
            i++;
        }

        book.add(i, c);


        // Using custom comparator
    	/* book.add(c);
           Collections.sort(book, new CustomComparator()); */
    }

    /**
     * 
     * @param fn
     * @param ln
     * 
     * Removes Contact with given first and last name. Prints error message if Contact does not exist.
     */
    public void remove(String fn, String ln)
    {
        int i = getIndex(fn, ln);
        if(i == -1)
        {
            System.out.println("Contact not found.");
        }

        book.remove(i);
    }

    /**
     * 
     * @param fn
     * @param ln
     * @return Contact with given first and last name. Returns null if not found.
     */
    public Contact get(String fn, String ln)
    {
        int i = getIndex(fn, ln);

        if(i == -1)
        {
            return null;
        }

        return book.get(i);
    }
    
    /**
     * 
     * @param fn
     * @param ln
     * @return index of Contact with given first and last name. Returns -1 if not found.
     * 
     * Uses binary search.
     */
    public int getIndex(String fn, String ln)
    {
    	int lo = 0;
        int hi = book.size() - 1;
        while (lo <= hi) 
        {
            int mid = lo + (hi - lo) / 2;
            if(ln.compareTo(book.get(mid).getLastName()) < 0) 
            {
                hi = mid - 1;
            }
            
            else if(ln.compareTo(book.get(mid).getLastName()) > 0)
            {
                lo = mid + 1;
            }
            
            else
            {
                return mid;
            }
        }
        return -1;
    }
    
    /**
     * Prints all Contacts in this AddressBook.
     */
    public void printList()
    {
    	
    }

    @Override
    public String toString()
    {
        String s = "";
        
        for(Contact c: book)
        {
            s += c;
            s += "\n";
        }
        
        return s;
    }
}

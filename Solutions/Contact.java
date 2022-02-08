/**
 * Write a description of class Contact here.
 *
 * @author Mr. King
 * @version 2/8/2022
 */
public class Contact
{
    private String last, first, work, mobile, email;
    
    public Contact(String first, String last)
    {
        this(first, last, "", "", "");
    }
    
    public Contact(String first, String last, String work, String mobile, String email)
    {
        this.last = last;
        this.first = first;
        this.work = work;
        this.mobile = mobile;
        this.email = email;
    }
    
    public String getLastName()
    {
        return last;
    }
    
    public String getFirstName()
    {
        return first;
    }
    
    public boolean equals(Contact c)
    {
        return (this.getLastName().equals(c.getLastName()) && this.getFirstName().equals(c.getFirstName()));
    }
    
    @Override
    public String toString()
    {
        String s = "";
        s += "-------------------------\n";
        s += "| " + first + " " + last + "\t\t|\n";
        s += "| M: " + mobile + "\t\t|\n";
        s += "| W: " + work + "\t\t|\n";
        s += "| E: " + email + "\t|\n";
        s += "-------------------------\n";
        
        return s;
    }
}

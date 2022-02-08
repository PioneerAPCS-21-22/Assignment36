/**
 * Write a description of class Runner here.
 *
 * @author King
 * @version 2/8/2022
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        AddressBook book = new AddressBook();
        String run = "yes";
        while(run.equalsIgnoreCase("yes"))
        {
            System.out.print("Would you like to (1) add, (2) access, (3) show list, or (4) delete? ");
            int input = Integer.parseInt(in.nextLine());

            if(input == 1)
            {
                System.out.print("Name: ");
                String n = in.nextLine();
                System.out.print("Mobile: ");
                String m = in.nextLine();
                System.out.print("Work: ");
                String w = in.nextLine();
                System.out.print("Email: ");
                String e = in.nextLine();
                Contact c = new Contact(n.substring(0, n.indexOf(" ")), n.substring(n.indexOf(" ") + 1), w, m, e);
                book.add(c);
            }

            else if(input == 2)
            {
                System.out.print("What is the name? ");
                String name = in.nextLine();
                String fn = name.substring(0, name.indexOf(" "));
                String ln = name.substring(name.indexOf(" ") + 1);
                Contact c = book.get(fn, ln);
                if(c == null)
                {
                    System.out.println("Contact not found.");
                }
                else
                {
                    System.out.println(c);
                }
            }

            else if(input == 3)
            {
                System.out.println(book);
            }

            else if(input == 4)
            {
                System.out.print("What is the name? ");
                String name = in.nextLine();
                String fn = name.substring(0, name.indexOf(" "));
                String ln = name.substring(name.indexOf(" ") + 1);
                book.remove(fn, ln);
            }
        
            else
            {
                System.out.println("Invalid entry.");
            }

            System.out.print("Continue? ");
            run = in.nextLine();
        }
    }
}

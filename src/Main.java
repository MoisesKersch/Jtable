import javax.swing.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        View view = new View();
        Model model = new Model();

        Controller controller = new Controller(view, model);

        view.setVisible(true);

        Vector myvector = new Vector();
        List mylist = new LinkedList();

        mylist.add("Maria");
        mylist.add("Da Silva");

        myvector.add(mylist);

        mylist.add("Mario");
        mylist.add("Gay Man");

        myvector.add(mylist);


        Iterator it = myvector.iterator();

        while (it.hasNext())
            System.out.println(it.next());


    }
}

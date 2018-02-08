import java.util.*;

public class Model
{
    private List mylist =  new LinkedList();
    private Vector myvector = new Vector();

    public Object setObject(String name, String lastname)
    {
        Object [] object = {name, lastname};
        return object;
    }

}

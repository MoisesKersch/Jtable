import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller
{
    View view;
    Model model;

    Controller(View view, Model model)
    {
        this.view = view;
        this.model = model;

       this.view.addListener(new DisplayListener());
    }

    class DisplayListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            view.displayFields((Object[]) model.setObject(view.getFirstName(), view.getLastName()));
        }
    }

}

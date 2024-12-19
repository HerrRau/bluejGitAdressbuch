
public abstract class ControllerUmsetzung implements Controller
{
    Model model;
    View view;

    public ControllerUmsetzung()
    {
    }
    
    public void modelSetzen(Model m) {
        this.model = m;
    }

    public void viewSetzen(View v) {
        this.view = v;
    }
    

}


public abstract class ControllerUmsetzung implements Controller
{
    Model model;
    View view;

    public ControllerUmsetzung()
    {
    }
    
    @Override
    public void modelSetzen(Model m) {
        this.model = m;
    }

    @Override
    public void viewSetzen(View v) {
        this.view = v;
    }
    

}

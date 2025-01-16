public abstract class ModelUmsetzung implements Model
{
    View view;

    public ModelUmsetzung() {
    }

    @Override
    public void viewSetzen(View v) {
        this.view = v;
    }

    public void anzahlEintraegeSenden(int i) {
        if (view!=null) {
            view.anzahlEintraegeAnzeigen(i);
        }
        else {
            System.out.println("Fehler: View ist noch nicht initialisiert.");
        }
    }

}

public class CoolController extends ControllerUmsetzung implements Controller
{
    Model model;
    View view;
    
    public CoolController(Model m, View v)
    {
        this.model = m;
        this.view = v;
    }

    public void adresseEintragen(Adresse a) {    
        if (this.model.adresseSuchen(new String(a.vornameGeben() + ", " + a.nachnameGeben())) == null) {
            this.model.adresseEintragen(a);
            this.view.kommentarAnzeigen("Adresse erfolgreich eingetragen.");
        } else {
            this.view.kommentarAnzeigen("Die Adresse existiert bereits.");
        }
    }
    
    public void adresseSuchen(String suchschluessel) {
        Adresse a = this.model.adresseSuchen(suchschluessel); 
        if (a != null) {
            this.view.adresseAnzeigen(a);
        } else {
            this.view.kommentarAnzeigen("Die Adresse kann nicht gefunden werden.");
        }
            
    }
    
    public void telefonAendern(String suchschluessel, String telefon){
        if (this.model.adresseSuchen(new String(suchschluessel)) == null) {
            this.model.telefonAendern(suchschluessel, telefon);
            this.view.kommentarAnzeigen("Adresse erfolgreich geändert.");
        } else {
            this.view.kommentarAnzeigen("Die Adresse existiert bereits.");
        }
    }
    
    public void emailAendern(String suchschluessel, String email){
        if (this.model.adresseSuchen(new String(suchschluessel)) == null) {
            this.model.emailAendern(suchschluessel, email);
            this.view.kommentarAnzeigen("E-Mail erfolgreich geändert.");
        } else {
            this.view.kommentarAnzeigen("Die Adresse existiert bereits.");
        }
    }
    
    public void modelSetzen(Model m) {
        if (m != null) {
            this.model = m;
        }
    }
    
    public void viewSetzen(View v) {
        if (v != null) {
            this.view = v;
        }
    }
}

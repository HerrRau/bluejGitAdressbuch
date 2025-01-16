
public class AllerbestesAdressbuch extends ModelUmsetzung
{
    public Binbaum b;
    public AllerbestesAdressbuch()
    {
        b = new Binbaum();
    }
    public void adresseEintragen(Adresse a) {
        b.einfuegen(a);
    }
    public Adresse adresseSuchen(String suchschluessel){
        return (Adresse) b.suchen(suchschluessel);
    }
    public void emailAendern(String suchschluessel, String email){
        Adresse d = (Adresse) b.suchen(suchschluessel);
        d.emailAendern(email);
    }
    public void telefonAendern(String suchschluessel, String telefon){
        Adresse d = (Adresse) b.suchen(suchschluessel);
        d.telefonAendern(telefon);
    }
}

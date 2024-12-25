public class Adresse implements Datenelement
{
    private String nachname;
    private String vorname;
    private String email;
    private String telefon;
    
    public Adresse(String nachname, String vorname, String email, String telefon)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.telefon = telefon;
    }
    
    public void emailAendern(String emailNeu) {
        this.email = emailNeu;
    }
    public void telefonAendern(String telefonNeu) {
        this.telefon = telefonNeu;
    }
    public String nachnameGeben() {
        return nachname;
    }
    public String vornameGeben() {
        return vorname;
    }
    public String emailGeben() {
        return email;
    }
    public String telefonGeben() {
        return telefon;
    }
    
    public String schluesselAlsStringGeben() {
        return nachname + ", " + vorname;
    }
    
    // Methoden, die als Datenelement gefordert sind
    
    public void informationAusgeben() {
    }
    
    public boolean schluesselIstGleich(String s) {
        return s.equals(this.schluesselAlsStringGeben());
    }

    public boolean schluesselIstGroesserAls(String s) {
        return s.compareTo(this.schluesselAlsStringGeben()) <= 0;        
    }

    public boolean istKleinerAls(Datenelement d) {
        Adresse a = (Adresse) d;
        return this.schluesselAlsStringGeben().compareTo(a.schluesselAlsStringGeben()) < 0;   
    }
    public boolean istGroesserAls(Datenelement d) {
                Adresse a = (Adresse) d;
        return this.schluesselAlsStringGeben().compareTo(a.schluesselAlsStringGeben()) > 0;   
    }
    public boolean istGleich(Datenelement d) {
        Adresse a = (Adresse) d;
        return this.schluesselAlsStringGeben().compareTo(a.schluesselAlsStringGeben()) == 0;           
    }

    
}

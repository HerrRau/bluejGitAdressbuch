public interface Model
{
    public void adresseEintragen(Adresse a);    
    public Adresse adresseSuchen(String suchschluessel);
    public void emailAendern(String suchschluessel, String email);
    public void telefonAendern(String suchschluessel, String telefon);
    public void viewSetzen(View v);


}

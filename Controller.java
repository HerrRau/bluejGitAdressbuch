public interface Controller
{
    void adresseEintragen(Adresse a);
    void adresseSuchen(String suchschluessel);
    void telefonAendern(String suchschluessel, String telefon);
    void emailAendern(String suchschluessel, String email);
    
    void setzeModel(Model m);
    void setzeView(View v);

}

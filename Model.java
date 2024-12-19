public interface Model
{
    void adresseEintragen(Adresse a);    
    Adresse adresseSuchen(String suchschluessel);

    void emailAendern(String suchschluessel, String email);
    void telefonAendern(String suchschluessel, String telefon);
    
    void setzeView(View v);


}

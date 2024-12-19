public interface View 
{
    void adresseAnzeigen(Adresse a);
    void anzahlEintraegeAnzeigen(int i);
    void kommentarAnzeigen(String s);

    void setzeController(Controller c);  

}

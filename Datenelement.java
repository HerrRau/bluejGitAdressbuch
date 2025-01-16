
public interface Datenelement {
    //Attribute - kann eine Schnittstelle gar nicht haben
    
    //Methoden    
    public void informationAusgeben();
    
    public boolean schluesselIstGleich(String s);
    public boolean schluesselIstGroesserAls(String s);

    public boolean istKleinerAls(Datenelement d);
    public boolean istGroesserAls(Datenelement d);
    public boolean istGleich(Datenelement d);
    
    
}

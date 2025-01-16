public abstract class Baumelement {
    // Attribute
    
    // Konstruktoren
    public Baumelement () {
    }

    // Methoden
    public abstract Baumelement einfuegen(Datenelement d);
    public abstract Datenelement suchen (String s);

    public abstract void inorderAusgeben();
    public abstract void preorderAusgeben();
    public abstract void postorderAusgeben();
    
    public abstract int anzahlGeben();
    public abstract int hoeheGeben();

}

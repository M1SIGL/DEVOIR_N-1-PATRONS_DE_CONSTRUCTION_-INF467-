package implementation_factory_methode.modele_generique;

public class Client 
{
    public Client()
    {
        //constructeur de classe
    }
    
    public  static void main(String[] args)
    {
        Fabrique fabrique = new Fabrique( );
            
        // Dépendance vers Produit
        Produit produit = fabrique.methodeFabrique(null);
        System.out.println("Produit: =>> "+ produit);


    }
}

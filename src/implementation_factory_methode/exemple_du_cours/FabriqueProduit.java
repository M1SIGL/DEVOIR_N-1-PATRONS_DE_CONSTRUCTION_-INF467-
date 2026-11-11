package implementation_factory_methode.exemple_du_cours;


public class FabriqueProduit
{  
    // Attributs de classe
    // Final signifie que l'attribut reste constant au sein de la class
    public static final String typeA="A";
    public static final String typeB="B";
    public static final String typeC="C";

    // constructeur de class
    public FabriqueProduit()
    {
        // constructeur de classe
    }
    
    public Produit createProduit(String type)
    {
        Produit produit = null;
        switch(type)
        {
            case typeA:
                produit = new ProduitA();
                break;
            case typeB:
                produit = new ProduitB();
                break;
            case typeC:
                produit = new ProduitC();
                break;
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
        return  produit;
    }
}

package implementation_factory_methode.modele_generique;

public class Fabrique
{  
    // Attributs de classe
    // Final signifie que l'attribut reste constant au sein de la class


    // constructeur de class
    public Fabrique()
    {
        // constructeur de classe
    }
    
    //

    public Produit methodeFabrique(String categories)
    {
        //Produit produit = null;
        
        return  new ProduitConcret();
        //return produit;
    }

}

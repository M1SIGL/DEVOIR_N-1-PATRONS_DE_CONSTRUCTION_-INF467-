package implementation_factory.factory_exemple_du_cours_modifie;

public class ProduitFactoryC extends ProduitFactory 
{
    protected Produit createProduit() {
        Produit produit=null;
        produit=new ProduitC();
        return produit;
    }
}

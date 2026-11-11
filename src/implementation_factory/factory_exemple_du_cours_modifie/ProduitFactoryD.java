package implementation_factory.factory_exemple_du_cours_modifie;

public class ProduitFactoryD extends ProduitFactory 
{
    protected Produit createProduit() {
        Produit produit=null;
        produit=new ProduitD();
        return produit;
    }
}

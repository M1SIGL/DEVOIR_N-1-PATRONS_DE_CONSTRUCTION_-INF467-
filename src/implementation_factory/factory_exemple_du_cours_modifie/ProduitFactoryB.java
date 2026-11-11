package implementation_factory.factory_exemple_du_cours_modifie;

public class ProduitFactoryB extends ProduitFactory {
    protected Produit createProduit() {
        Produit produit=null;
        produit=new ProduitB();
        return produit;
    }
}

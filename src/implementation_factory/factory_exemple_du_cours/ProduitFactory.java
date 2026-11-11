package implementation_factory.factory_exemple_du_cours;


public abstract class ProduitFactory {
    public Produit getProduit() {
        return createProduit();
    }
    protected abstract Produit createProduit();
}

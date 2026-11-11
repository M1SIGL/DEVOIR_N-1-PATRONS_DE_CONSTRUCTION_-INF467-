package implementation_factory.factory_exemple_du_cours_modifie;

public abstract class ProduitFactory {
    public Produit getProduit() {
        return createProduit();
    }
    protected abstract Produit createProduit();
}

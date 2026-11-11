package implementation_factory.factory_exemple_du_cours_modifie;

public class Client {

    public  Client()
    {
        //constructeur de classe
    }
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        System.out.println("............Methode 2: Abstract Factory............");
        ProduitFactory produitFactoryA=new ProduitFactoryA();
        ProduitFactory produitFactoryB=new ProduitFactoryB();
        ProduitFactory produitFactoryC=new ProduitFactoryC();
        ProduitFactory produitFactoryD=new ProduitFactoryD();

        Produit produit=null;
        //affiche un produit de type A
        produit=produitFactoryA.getProduit();
        produit.methodeproduit();
        //affiche un produit de type B
        produit=produitFactoryB.getProduit();
        produit.methodeproduit();
        //affiche un produit de type C
        produit=produitFactoryC.getProduit();
        produit.methodeproduit();

         //affiche un produit de type D
        produit=produitFactoryD.getProduit();
        produit.methodeproduit();
    }
}

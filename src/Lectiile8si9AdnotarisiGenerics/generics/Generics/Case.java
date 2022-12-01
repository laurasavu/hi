package Lectiile8si9AdnotarisiGenerics.generics.Generics;

public class Case extends AltBuilding {

    String cartier;

    public Case() {
    }

    public Case(String cartier) {
        this.cartier = cartier;
    }



    public String getCartier() {
        return cartier;
    }

    public void setCartier(String cartier) {
        this.cartier = cartier;
    }

    @Override
    public String toString() {
        return "Case{" +
                "cartier='" + cartier + '\'' +"}";
    }
}


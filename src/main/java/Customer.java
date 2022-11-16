public class Customer {

    private String name;
    private double wallet;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return this.name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;

    }

    public void buyArtwork(Gallery gallery, Artwork artwork) {
        wallet -= artwork.getPrice();
        gallery.removeArtworkFromStock(artwork);
        gallery.addMoney(artwork);

    }










}

import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork>stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<Artwork>();
    }

    //GETTERS AND SETTERS

    public String getName() {
        return this.name;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public double getTill(){
        return this.till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    // add money to till
    public void addMoney(Artwork artwork) {
        till += artwork.getPrice();
    }


    public void addArtwork(Artwork artwork) {
        this.stock.add(artwork);
    }

    public void removeArtworkFromStock(Artwork artworkToRemove) {
        for (Artwork artwork: stock) {
            if (artwork == artworkToRemove) {
                stock.remove(artwork);
            }
        }
    }


    public ArrayList<Artwork> getArtwork() {
        return this.stock;
    }







    }


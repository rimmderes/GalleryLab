public class Artwork {

    private String title;
    private String artist;
    private double price;
    private String nft;

    public Artwork(String title, String artist, double price, String nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    // Getters and Setters

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNft() {
        return this.nft;
    }

    public void setNft(String nft) {
        this.nft = nft;
    }


}

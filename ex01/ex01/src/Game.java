public class Game {
    public String title;
    public String publisher;
    public String company;
    public String price;
    public String date;
    public String trailer;
    public String discounts;

    public Game(
     String title,
     String publisher,
     String company,
     String price,
     String date,
     String trailer,
     String discounts) {
        this.title = title;
        this.publisher = publisher;
        this.company = company;
        this.price = price;
        this.date = date;
        this.trailer = trailer;
        this.discounts = discounts;
    }
}
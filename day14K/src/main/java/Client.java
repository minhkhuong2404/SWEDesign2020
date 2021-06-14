public class Client {
    public static void main(String[] args){
        Player player = new Player("Hello");
        Court court101 = new Court("101");

        Request add = new AddCourt(court101, player);
        Request book = new BookCourt(court101, player);

        CourtManager courtManager = new CourtManager(add, book);

        courtManager.sendAddCourt();
        courtManager.sendBookCourt();
    }
}

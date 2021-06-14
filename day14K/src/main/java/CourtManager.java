public class CourtManager {
    private Request addCourt;
    private Request bookCourt;

    public CourtManager(Request addCourt, Request bookCourt){
        this.addCourt = addCourt;
        this.bookCourt = bookCourt;
    }

    public void sendAddCourt(){
        System.out.println("Send add court request");
        addCourt.execute();
    }

    public void sendBookCourt(){
        System.out.println("Send book court request");
        bookCourt.execute();
    }

}

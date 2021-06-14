package com.company;

public class Booking {
    private Price price;
    private CourtType courtType;
    private Hours hours;
    private Holiday holiday;
    private Events events;

    public Booking(Price price,Hours hours,Holiday holiday,Events events, CourtType courtType){
        super();
        this.price = price;
        this.hours = hours;
        this.holiday = holiday;
        this.events = events;
        this.courtType = courtType;
    }
    public String toString() {
        return "Booking [Price=" + price + ", Hours=" + hours + ", Holiday=" + holiday + ", Type=" + courtType
                 + "]";
    }
    public Price getPrice() {
        return price;
    }

    public Hours getHours() {
        return hours;
    }

    public Holiday getHoliday() {
        return holiday;
    }

    public Events getEvents(){
        return events;
    }
    public CourtType getCourtType(){
        return courtType;
    }

}
enum Price {
    One,Two,Three;
}

enum Hours {
    One,Two,Three;
}

enum Holiday {
    One,Two,Three;
}

enum Events {
    One,Two,Three;
}
enum CourtType{
    Badminton,Zumba;
}


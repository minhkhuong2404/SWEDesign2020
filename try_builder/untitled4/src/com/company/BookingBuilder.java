package com.company;

import com.company.*;

public interface BookingBuilder {

    BookingBuilder price(Price price);

    BookingBuilder hours(Hours hours);

    BookingBuilder holiday(Holiday holiday);

    BookingBuilder events(Events events);

    BookingBuilder courtType(CourtType courtType);

    Booking build();

}





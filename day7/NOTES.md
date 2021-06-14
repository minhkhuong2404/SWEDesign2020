# Scenario

+ There's a constructor for creating a `Player`
+ `Booking` contains `start`, `end`, and a `Player`
    + `ZumbaClass` extends `Booking`
    + `BadmintonCourt` extends `Booking`
+ `PaymentMethod`, which the `Booking` has no idea about, contains the `Player`
    + `ConsortiumCard` extends `PaymentMethod`
    + `DebitCard` extends `PaymentMethod`

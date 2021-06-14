package com.company;

public class Player2 implements Member {
    public void update(ZumbaClass zumbaClass){
        if (zumbaClass.getStatus() == 1){
            System.out.println("Enroll");
        }
        else {
            System.out.println("Not Enroll");
        }
    }
}

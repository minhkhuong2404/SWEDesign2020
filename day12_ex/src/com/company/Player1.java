package com.company;

public class Player1 implements Member{
    public void update(ZumbaClass zumbaClass){
        if (zumbaClass.getStatus() == 0){
            System.out.println("Enroll");
        }
        else {
            System.out.println("Not Enroll");
        }
    }
}

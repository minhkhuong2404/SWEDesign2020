package com.company;

public class Trainer implements Member {
    public void update(ZumbaClass zumbaClass){
        if (zumbaClass.getStatus() == 0){
            System.out.println("Teaches");
        }
        else {
            System.out.println("Not Teaches");
        }
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Match implements Participant{
    private List<Participant> participantList = new ArrayList<Participant>();
    public void showName() {
        for(Participant par:participantList){
            par.showName();
        }
    }
    public void addParticipant(Participant par){
        participantList.add(par);
    }
    public void eliminated(Participant par){
        participantList.remove(par);
    }
    public void getWinner(Participant winner){
        participantList.removeAll(participantList);
        participantList.add(winner);
    }

}

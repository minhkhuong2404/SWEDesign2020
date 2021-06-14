package com.company;

import java.util.ArrayList;
import java.util.List;

public class ZumbaClass implements Manager {
    private int status;
    private List<Member> members = new ArrayList<>();


    public int getStatus(){
        return status;
    }
    public void setStatus(int status){
        this.status = status;
        updateStatus();
    }

    @Override
    public void addMember(Member member) {
        members.add(member);
    }

    @Override
    public void removeMember(Member member) {
        members.remove(member);
    }

    @Override
    public void updateStatus() {
        for ( Member member : members){
            member.update(this);
        }
    }
}

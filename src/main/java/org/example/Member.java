package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member {
    String id;
    String name;
    Integer coins;

    private List<String>memberList=new ArrayList<>();

    public Member(String id, String name, Integer coins) {
        memberList.add(id);
        this.id = id;
        this.name = name;
        this.coins = coins;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }
    public static List<Integer> getMemberList(){
        return  getMemberList();
    }
}

package oo.designpattern.composite;

import java.util.ArrayList;

// Component
abstract class Group {
    private String name;
    Group(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    public abstract void print();

}

// Leaf
class Team extends Group {
    Team(String name) {
        super(name);
    }
    @Override
    public void print() {
        System.out.println(getName()+"(Leaf)");
    }
}

// Composite
class League extends Group {
    private ArrayList<Group> groupList = new ArrayList<>();
    League(String name) {
        super(name);
    }
    @Override
    public void print() {
        System.out.println(getName()+"(Composite):");
        for(Group group:groupList) {
            System.out.print("----");
            group.print();
        }
    }
    public void addGroup(Group group) {
        groupList.add(group);
    }
}


public class CompositeClient {
    public static void main(String[] args) {
        League topLeague = new League("Top oo.designpattern.composite.League");
        League localLeague = new League("Local oo.designpattern.composite.League");
        Group firstTeam = new Team("First oo.designpattern.composite.Team");
        Group secondTeam = new Team("Second oo.designpattern.composite.Team");
        Group thirdTeam = new Team("Third oo.designpattern.composite.Team");
        Group fourthTeam = new Team("Fourth oo.designpattern.composite.Team");

        localLeague.addGroup(firstTeam);
        localLeague.addGroup(secondTeam);

        topLeague.addGroup(thirdTeam);
        topLeague.addGroup(localLeague);
        topLeague.addGroup(fourthTeam);
        topLeague.print();
    }
}
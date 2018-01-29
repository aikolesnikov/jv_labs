package model;

import java.util.LinkedList;
import java.util.List;

public class Entity {

    private TextType type;
    private List<TextType> parts = new LinkedList<TextType>();
    private String text;

    public Entity(TextType type, String text) {
    } // call setType, setText

    public List<TextType> getParts() {
        return null;
    } // implement

    public void addPart(Entity e) {
    } // implement

    // implement getters and setters here
}


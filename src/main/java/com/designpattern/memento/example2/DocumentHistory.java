package com.designpattern.memento.example2;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {

    public List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state){
        states.add(state);
    }

    public DocumentState pop(){
        var lastIndex = states.size()-1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }

    public int size(){
        return states.size();
    }


}
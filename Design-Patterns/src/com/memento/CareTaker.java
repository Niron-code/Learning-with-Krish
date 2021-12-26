package com.memento;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 20-December-2021 at 11:37
 * @Project Design-Patterns
 * Happy Coding..!
 */
import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}

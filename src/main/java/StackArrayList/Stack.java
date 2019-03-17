package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList<E> elements;


    public Stack(E nextElement){
    elements.add(nextElement);
    }

    public  E pop(){
        if(isEmpty()){throw new IndexOutOfBoundsException("Stack is empty");}
        return elements.remove(elements.size()-1);
        }



    public Boolean isEmpty(){
    return elements.isEmpty();
    }



}

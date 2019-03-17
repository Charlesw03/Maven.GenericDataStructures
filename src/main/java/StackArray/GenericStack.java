package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int size;


    public GenericStack() {
        elements = (E[]) new Object[0];

    }

    public Boolean isEmpty() {
        return elements.length < 1;
    }

    public void push(E foobar) {
        //what array your copying and then the new length of that copy
        this.elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = foobar;

    }
    public E pop(){
        E placeholder = elements[elements.length-1];
        elements=Arrays.copyOf(elements,elements.length-1);
        return placeholder;
    }

}


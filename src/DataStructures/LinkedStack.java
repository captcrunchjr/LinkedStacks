package DataStructures;

import Exceptions.*;
import ADTs.*;

public class LinkedStack<T extends Comparable<T>> implements StackADT<T> {
    
    SinglyLinkedNode<T> top;
    int size=0;

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(T element) {
        SinglyLinkedNode newNode = new SinglyLinkedNode<T>(element);

        if(isEmpty()){
            top = newNode;
        }
        else{
            // top -> [1]
            // push[2]
            // top -> [2] -> [1]

            // newNode -> [2]
            // top -> [1]
            newNode.setNext(top);
            top = newNode;
        }
        try{
        int count = 0;
        SinglyLinkedNode<T> i = top;
        while(count <= size){
            System.out.println(i.getData());
            i = i.getNext();
            count++;
        }
        System.out.println("-------");
    }
    catch(NullPointerException d){
        d.getStackTrace();
    }
        size++;

    }

    @Override
    public T pop() throws EmptyCollectionException {
            if(isEmpty()){
            throw new EmptyCollectionException();
        }
        //remove and return the stop.
        //remove top
        //move next to top
        //return top
        T data = top.getData();
        System.out.println("Data: " + data);
        //try{
        top = top.getNext();
        size--;
        /*System.out.println("Size: " + size);
        int count = 0;
        SinglyLinkedNode<T> i = top;
        while(size != 0){
            System.out.println(i.getData());
            i = i.getNext();
            count++;
        }
        System.out.println("-------");
    }catch(NullPointerException d){
        d.printStackTrace();
    }*/

        return data;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        //return top

        return top.getData();

    }

}
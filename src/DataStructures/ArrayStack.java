package DataStructures;

import ADTs.StackADT;
import Exceptions.EmptyCollectionException;
import Exceptions.StackOverflowException;

public class ArrayStack<T> implements StackADT<T> {
  /** The index of where the top of the stack is */
  int top;
  /** The array that holds the stack */
  T[] buffer;

  public ArrayStack() {
  }

  public ArrayStack(int initialCapacity) {
  }

}

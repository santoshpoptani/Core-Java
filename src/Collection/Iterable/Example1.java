package Collection.Iterable;

import java.util.Iterator;

/**
 * This the simple Example which shows the Generic and Implementation of Iterable Interface
 *
 * Iterabe Interface has 'iterator function' which returns iterator.
 * The Iterartor Interface has two methods 'hasNext()' and 'next()' which can be implemented by our own logic
 * */

public class Example1<T> implements Iterable<T> {

    private T[] items;
    private  int size;

    Example1(){
        size=0;
        items = (T[])new Object[100];
    }

    public void add(T item){
        items[size++] = item;
    }

    public T getItem(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new Example1Iterator(this);
    }

    private class Example1Iterator implements Iterator{

        private  Example1<T> list;
        private  int index = 0;

        Example1Iterator(Example1<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public Object next() {
            return list.items[index++];
        }
    }
}

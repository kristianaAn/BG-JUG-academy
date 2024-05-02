package data_structures_exam_14;

import java.util.*;

@SuppressWarnings("unchecked")
public class Multiset<E> extends MultisetUtils implements Set<E> {

    private java.util.HashMap<E, Integer> multiset = new LinkedHashMap<>();

    public Multiset() {
    }

    public HashMap<E, Integer> getMultiset() {
        return multiset;
    }

    public void setMultiset(HashMap<E, Integer> multiset) {
        this.multiset = multiset;
    }

    @Override
    public int size() {
        return multiset.size();
    }

    @Override
    public boolean isEmpty() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        return this.multiset.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) this.multiset.entrySet().iterator();
    }

    @Override
    public Object[] toArray() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean add(E e) {
        if (!multiset.containsKey(e)) {
            multiset.put(e, 1);
        } else {
            multiset.put(e, multiset.get(e) + 1);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public int hashCode() {
        throw new java.lang.UnsupportedOperationException();
    }

    public int count(E element) {
        if (this.multiset.containsKey(element)) {
            return this.multiset.get(element);
        } else {
            return 0;
        }
    }


}






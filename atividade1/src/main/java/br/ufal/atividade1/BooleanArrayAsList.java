package br.ufal.atividade1;


import static br.ufal.atividade1.teste.Bools.checkElementIndex;
import static br.ufal.atividade1.teste.Bools.checkNotNull;

import static br.ufal.ic.atividades.teste.Bools.checkElementIndex;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

public class BooleanArrayAsList extends AbstractList<Boolean>
        implements RandomAccess, Serializable {

    final boolean[] array;
    final int start;
    final int end;

    BooleanArrayAsList(boolean[] array) {
        this(array, 0, array.length);
    }

    BooleanArrayAsList(boolean[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public int size() {
        return end - start;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Boolean get(int index) {
        checkElementIndex(index, size(), "index");
        return array[start + index];
    }

    @Override
    public boolean contains(Object target) {
        // Overridden to prevent a ton of boxing
        return (target instanceof Boolean)
                && Bools.indexOf(array, (Boolean) target, start, end) != -1;
    }

    @Override
    public int indexOf(Object target) {
        // Overridden to prevent a ton of boxing
        if (target instanceof Boolean) {
            int i = Bools.indexOf(array, (Boolean) target, start, end);
            if (i >= 0) {
                return i - start;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object target) {
        // Overridden to prevent a ton of boxing
        if (target instanceof Boolean) {
            int i = Bools.lastIndexOf(array, (Boolean) target, start, end);
            if (i >= 0) {
                return i - start;
            }
        }
        return -1;
    }

    @Override
    public Boolean set(int index, Boolean element) {
        checkElementIndex(index, size(), "index");
        boolean oldValue = array[start + index];
        // checkNotNull for GWT (do not optimize)
        array[start + index] = checkNotNull(element);
        return oldValue;
    }

    @Override
    public List<Boolean> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("not implemented yet.");
//      int size = size();
//      checkPositionIndexes(fromIndex, toIndex, size);
//      if (fromIndex == toIndex) {
//        return Collections.emptyList();
//      }
//      return new BooleanArrayAsList(array, start + fromIndex, start + toIndex);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof BooleanArrayAsList) {
            BooleanArrayAsList that = (BooleanArrayAsList) object;
            int size = size();
            if (that.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (array[start + i] != that.array[that.start + i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (int i = start; i < end; i++) {
            result = 31 * result + Boolean.hashCode(array[i]);
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(size() * 7);
        builder.append(array[start] ? "[true" : "[false");
        for (int i = start + 1; i < end; i++) {
            builder.append(array[i] ? ", true" : ", false");
        }
        return builder.append(']').toString();
    }

    boolean[] toBooleanArray() {
        return Arrays.copyOfRange(array, start, end);
    }

    private static final long serialVersionUID = 0;
}


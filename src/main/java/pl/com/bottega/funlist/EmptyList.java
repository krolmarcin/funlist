package pl.com.bottega.funlist;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EmptyList<T> implements FunList<T> {

    @Override
    public FunList<T> add(T t) {
        return new NonEmptyList<T>(t);
    }

    @Override
    public FunList<T> remove(T t) {
        return null;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public void each(Consumer<T> consumer) {
    }

    @Override
    public FunList<T> filter(Predicate<T> predicate) {
        return null;
    }

    @Override
    public <S> FunList<S> map(Function<T, S> function) {
        return null;
    }

}

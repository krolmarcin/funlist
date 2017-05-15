package pl.com.bottega.funlist;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NonEmptyList<T> implements FunList<T> {

    private final T head;
    private final FunList<T> tail;

    public NonEmptyList(T t) {
        tail = new EmptyList<>();
        head = t;
    }

    public NonEmptyList(T head, FunList<T> tail) {
        this.tail = tail;
        this.head = head;
    }

    @Override
    public FunList<T> add(T t) {
        return new NonEmptyList<>(head, tail.add(t));
    }

    @Override
    public FunList<T> remove(T t) {
        return null;
    }

    @Override
    public boolean contains(T t) {
        return head.equals(t) || tail.contains(t);
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

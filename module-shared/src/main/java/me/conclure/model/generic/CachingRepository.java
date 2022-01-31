package me.conclure.model.generic;

import me.conclure.clonomy.annotations.NonNull;
import me.conclure.clonomy.annotations.ThreadSafe;

import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Function;

@ThreadSafe
@NonNull
public interface CachingRepository<I, T extends DataTransfer<?>> extends Iterable<T> {

    Optional<T> getIfPresent(I identifier);

    T getOrCreate(I identifier);

    Collection<? extends T> getAll();

    <R> Collection<? extends R> applyAndGetAll(Function<? super T, ? extends R> transformer);

    @Override
    Iterator<T> iterator();

    boolean invalidate(I identifier);

    boolean isContained(I identifier);
}
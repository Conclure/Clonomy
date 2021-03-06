package me.conclure.clonomy.model.generic.storage;

import me.conclure.clonomy.annotations.NonNull;
import me.conclure.clonomy.model.generic.DataTransfer;

public interface PersistenceStorage<D extends DataTransfer<?>> {

    void load(D transfer);

    void save(D transfer);

    default void saveAll(Iterable<? extends D> transfers) {
        for (D transfer : transfers) {
            this.save(transfer);
        }
    }

    default void loadAll(Iterable<? extends D> transfers) {
        for (D transfer : transfers) {
            this.load(transfer);
        }
    }
}
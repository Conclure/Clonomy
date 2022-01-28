package me.conclure.annotation;

import java.lang.annotation.*;

@Target({
        ElementType.TYPE,
        ElementType.ANNOTATION_TYPE,
        ElementType.TYPE_PARAMETER,
        ElementType.TYPE_USE,
        ElementType.METHOD,
        ElementType.CONSTRUCTOR,
})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(SoftNullable.Repeat.class)
public @interface SoftNullable {

    @Target({
            ElementType.TYPE,
            ElementType.ANNOTATION_TYPE,
            ElementType.TYPE_PARAMETER,
            ElementType.TYPE_USE,
            ElementType.METHOD,
            ElementType.CONSTRUCTOR,
    })
    @Retention(RetentionPolicy.RUNTIME)
    @interface Repeat {
        SoftNullable[] value();
    }
}

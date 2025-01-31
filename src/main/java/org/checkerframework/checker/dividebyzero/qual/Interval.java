package org.checkerframework.checker.dividebyzero.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * You do not want a qualifier `@Top`. It appears here as a placeholder, so that the project
 * compiles.
 */
@DefaultQualifierInHierarchy
@SubtypeOf({})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Top {}

@TypeQualifier
@SubtypeOf({Top.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Interval {
    int min();
    int max();
}

@DefaultQualifierInHierarchy
@SubtypeOf({Top.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Undefined {}

@DefaultQualifierInHierarchy
@SubtypeOf({Top.class, Interval.class, Undefined.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Bottom {}

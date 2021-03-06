package com.github.snqlby.tgwebhook.methods;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Fires if a new user has joined a room
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface JoinMethod {

  long ANY = -1L;

  long[] room() default ANY;

  JoinReason[] reason() default JoinReason.ALL;
}

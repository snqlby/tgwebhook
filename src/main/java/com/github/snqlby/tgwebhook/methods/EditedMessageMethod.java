package com.github.snqlby.tgwebhook.methods;

import com.github.snqlby.tgwebhook.Locality;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Indicates a method which will be used for EditedMessage requests.</p>
 * <p>The method must contain these args and return back the following:</p>
 * {@code public BotApiMethod yourMethodName(AbsSender,Message)}
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface EditedMessageMethod {

  String value() default "";

  Locality[] locality() default Locality.ALL;
}

package sojourn.model.anno;

import java.lang.annotation.*;

/**
 * Used by implementations of SearchDefinition to specify the class to be returned for each row.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(SearchParameters.class)
public @interface SearchParameter {
    String name();
    String column();
    boolean required() default false;
    Class type() default String.class;
}

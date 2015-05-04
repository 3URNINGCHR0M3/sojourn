package sojourn.model.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines the table which backs an object.  Used in ORM and search features.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Table {

    /**
     * The name of the table which backs the object.
     */
    String name();

    /**
     * The name of the schema where the table exists.  Not required.
     */
    String schema() default "same";

}

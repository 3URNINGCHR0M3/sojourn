package sojourn.model.anno;

import java.lang.annotation.*;

/**
 * Identifies an attribute as representing a dependent table.  Represents a join between the two tables.
 * May only be associated with attributes with a class which implements the List interface.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(JoinColumns.class)
public @interface JoinOn {

    /**
     * Then name of the columns in the parent table to use in the join.
     */
    String local();

    /**
     * Then name of the columns in the child table to use in the join.
     */
    String remote();

}

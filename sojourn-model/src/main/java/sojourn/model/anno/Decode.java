package sojourn.model.anno;

/**
 * Used to replace a coded value with the expanded value.  For example, you might have a table of
 * delivery service where 1 = 'FedEx', 2 = 'UPS' and 3 = 'USPS'.  Your class would require two fields.
 * One to read the value from the database, using the @Column annotation, as a numeric value.  The
 * second field will be a String type with the @Decode annotation to define how to get the decoded value.
 */
public @interface Decode {

    /**
     * The name of the dependent table to query.
     */
    String table();
    /**
     * The name of the schema where the table exists.  Not required.
     */
    String schema() default "same";

    /**
     * Then name of the columns in the parent table to use in the join.
     */
    String[] local();

    /**
     * Then name of the columns in the child table to use in the join.
     */
    String[] remote();

}

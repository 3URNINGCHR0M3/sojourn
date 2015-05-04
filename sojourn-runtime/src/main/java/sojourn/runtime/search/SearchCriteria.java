package sojourn.runtime.search;

/**
 * Represents the name value pair for a search predicate.
 */
public class SearchCriteria {

    private final String _column;
    private final String _value;

    public SearchCriteria(final String column,
                          final String value) {
        _column = column;
        _value = value;
    }

    public String getColumn() {
        return _column;
    }

    public String getValue() {
        return _value;
    }

}

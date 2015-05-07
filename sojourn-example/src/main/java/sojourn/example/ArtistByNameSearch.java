package sojourn.example;

import sojourn.model.SearchDefinition;
import sojourn.model.anno.SearchParameter;
import sojourn.model.anno.SearchResult;
import sojourn.model.anno.Table;

/**
 * Represents a search of the artist table by name.
 */
@Table(name="artist")
@SearchParameter(name="first name", column = "first_name", required = false)
@SearchParameter(name="last name", column = "last_name", required = false)
@SearchResult(type = Artist.class)
public class ArtistByNameSearch implements SearchDefinition {
}

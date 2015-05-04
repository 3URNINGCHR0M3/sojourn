package sojourn.example;

import sojourn.model.anno.Column;
import sojourn.model.anno.Table;

/**
 *
 */
@Table(name="artist")
public class Artist {

    @Column(name="artist_id")
    public Integer artist;

    @Column(name="first_name")
    public String firstName;

    @Column(name="last_name")
    public String lastName;

    @Column(name="stage_name")
    public String stageName;

}

/**
 * Created by chrisschayer on 3/31/16.
 */
public abstract class Art implements Activity {

    @Override
    public Location location() {
        Venue venue = new Venue();

        return venue;
    }

}


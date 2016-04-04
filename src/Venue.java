/**
 * Created by chrisschayer on 3/31/16.
 */
public class Venue implements Location{


    @Override
    public String location(String venue)
    {
        //Use toUpperCase to implement switch statements as well as ignore capitilzation issues. 
        switch(venue.toUpperCase())
        {

            case "GYMNASTICS":
            case "CREATIVE DANCE":
                venue = "Inside - Gym";
                break;

            case "SWIMMING":
            case "SYNCHRONIZED SWIMMING":
                venue = "Outside - Pool";
                break;

            case "BASEBALL":
                venue = "Outside - Field";
                break;

            case "SEWING":
            case "PAINTING":
                venue = "Inside - Hobby Hut";
                break;

            case "PHOTOGRAPHY":
            case "HORTICULTURE":
                venue = "Outside - Nature";
                break;
            default:
                venue = "Invalid Activity";
        }
        return venue;
    }
}

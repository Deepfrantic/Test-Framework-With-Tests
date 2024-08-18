package constants;

import api.utils.UtilsMethod;

public class Constants {
    public static class ServerName{
        public static String GOOGLE_PLACE_SERVER = "https://maps.googleapis.com/";
    }

    public static class Path{
        public static String GOOGLE_PLACE_PATH = "maps/api/place/";
    }
    public static class Endpoint{
        public static String GOOGLE_PLACE_ENDPOINT_SEARCH = "findplacefromtext/json";
    }
    public static final String API_TOKEN = UtilsMethod.getValue("TOKEN");
}

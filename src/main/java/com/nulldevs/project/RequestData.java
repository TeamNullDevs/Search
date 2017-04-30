package com.nulldevs.project;

/**
 * Created by Novitskyi Pavel on 27/04/2017.
 */
public class RequestData {
    //parameters to get
    public static String API = "https://openapi.etsy.com/v2/listings/active?api_key=";
    public static String INCLUDE_IMAGE = "&includes=MainImage";
    public static String SEARCH = "&keywords=";
    public static String SORT_ON = "&sort_on=";
    public static String SORT_ORDER = "&sort_order=";
    public static String API_KEY = "ws728meqrrabg7siyjirirxi";
    public static String LIMIT = "&limit=";
    public static String OFFSET = "&offset=";

    public static final int SORT_RELEVANCE = 0;
    public static final int SORT_HIGHEST_PRICE = 1;
    public static final int SORT_LOWEST_PRICE = 2;
    public static final int SORT_MOST_RECENT = 3;

    public static final String TAG_RESULTS = "results";

    public static String getSortQuery(int sortOrder) {
        String url = "";
        switch (sortOrder) {
            case SORT_RELEVANCE:
                return url;
            case SORT_HIGHEST_PRICE:
                return url + SORT_ON + "price" + SORT_ORDER + "down";
            case SORT_LOWEST_PRICE:
                return url + SORT_ON + "price" + SORT_ORDER + "up";
            case SORT_MOST_RECENT:
                return url + SORT_ON + "created" + SORT_ORDER + "down";
            default:
                return url;
        }
    }
}

package info.garagesalesapp.domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by jamesharmon on 5/2/17.
 */
public class JsonDisplay {

    public static String showJson(Object object) {

        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(object);
        System.out.println(json);

        return null;
    }
}

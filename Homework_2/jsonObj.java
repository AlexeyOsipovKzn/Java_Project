import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class jsonObj {
    public static void main(String[] args) throws IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader("file.json"));

        JSONArray arr = (JSONArray) obj;

        Iterator iter = arr.iterator();

        String output = new String("Студент [фамилия] получил [оценка] по предмету [предмет]");

        while (iter.hasNext()) {
            JSONObject res = (JSONObject) iter.next();
            String str = String.format("Студент [%s] получил [%s] по предмету [%s]", res.get("фамилия"),
                    res.get("оценка"), res.get("предмет"));
            System.out.println(str);
        }

    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class nameList {
    public static String[] str = {
            "Диана Григорьевна",
            "Марина Матвеевна",
            "Валентина Юрьевна",
            "Иван Александрович",
            "Алексей Владимирович",
            "Мария Никитична",
            "Валентина Юрьевна",
            "Диана Григорьевна",
            "Валентина Юрьевна",
            "София Львовна",
            "Андрей Александрович",
            "София Львовна",
            "Иван Александрович",
            "Иван Александрович"
    };
    public static ArrayList<String> word = new ArrayList<>(Arrays.asList(str));
    public static HashMap<String, Integer> result = new HashMap<>();

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < word.size(); i++) {
            for (int j = 0; j < word.size(); j++) {
                if (word.get(i).equals(word.get(j))) {
                    count++;
                }
                result.put(word.get(i), count);
            }
            count = 0;
        }

        result.entrySet().removeIf(entry -> entry.getValue().equals(1));

        for (var el : result.entrySet()) {
            System.out.printf("Найденное совпадение: " + el.getKey() + " в колличестве: " + el.getValue() + "\n");
        }
    }
}

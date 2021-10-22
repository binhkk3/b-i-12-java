package thuc_hanh_3;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private HashMap<String, String> list;

    public Dictionary() {
        list = new HashMap<>();
        list.put("dog", "chó");
        list.put("cat", "mèo");
        list.put("kitty", "mèo con");
        list.put("red", "đỏ");
        list.put("mid", "giữa");
        list.put("top", "trên");
        list.put("bot", "dưới");
        list.put("kill", "giết chết");
        list.put("die", "chết");
        list.put("end", "kết thúc");
    }


    public void add(String key, String value) {

        value.trim();
        char[] charArray = key.trim().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }
        }
        value = String.valueOf(charArray);
        key = String.valueOf(charArray);
        list.put(key, value);

    }

    public String find(String key) {

        char[] charArray = key.trim().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }
        }
        key = String.valueOf(charArray);
        boolean isContainWord = list.containsKey(key.trim());
        if (isContainWord) {
            return " Nghĩa của từ " + key + " là " + list.get(key.trim());
        }
        return "Ko tim thấy";
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "list=" + list +
                '}';
    }


}

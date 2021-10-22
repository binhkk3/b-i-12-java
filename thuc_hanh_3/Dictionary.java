package thuc_hanh_3;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private HashMap <String, String> list;

    public Dictionary() {
        list =new HashMap<>();
        list.put("dog","chó");
        list.put("cat",  "mèo");
        list.put("kitty","mèo con");
        list.put("red","đỏ");
        list.put("mid","giữa");
        list.put("top","trên");
        list.put("bot","dưới");
        list.put("kill","giết chết");
        list.put("die","chết");
        list.put("end","kết thúc");
    }


    public void add(String key, String value) {
        list.put(key, value);

    }
    public String find(String key){
        boolean isContainWord = list.containsKey(key);
        if(isContainWord){
            return " Nghĩa của từ "+key + " là " +list.get(key);
        }return "Ko tim thấy";
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "list=" + list +
                '}';
    }

}

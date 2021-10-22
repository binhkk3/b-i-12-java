package thuc_hanh_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String ,String> hashMap = new HashMap<>();
        hashMap.put("dog","chó");
        hashMap.put("cat",  "mèo");
        hashMap.put("kitty","mèo con");
        hashMap.put("red","đỏ");
        hashMap.put("mid","giữa");
        hashMap.put("top","trên");
        hashMap.put("bot","dưới");
        hashMap.put("kill","giết chết");
        hashMap.put("die","chết");
        hashMap.put("end","kết thúc");
        System.out.println("nhập vào 1 chữ ");
        String key = scanner.nextLine();
if (hashMap.containsKey(key)){
    System.out.println("nghĩa củ từ "+key+" là " +hashMap.get(key));
}else {
    System.out.println("không có đâu cu dừng tìm " );
}
    }
}

package thuc_hanh_3;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Dictionary myDictionary =new Dictionary();
        myDictionary.add("hello","xin chào");
        System.out.println(myDictionary);
        System.out.println("nhập từ bạn muốn tìm");
        String key =scanner.nextLine();
        System.out.println(myDictionary.find(key));


    }

}

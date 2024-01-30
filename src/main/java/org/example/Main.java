package org.example;
import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> stocks = new HashMap<>();
        stocks.put("トイレットペーパー", 3);
        stocks.put("キッチンペーパー", 4);
        stocks.put("ティッシュペーパー", 8);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        for (String key : stocks.keySet()){
            int value = stocks.get(key);
            System.out.println(key + "の在庫数は" + value + "個です");
        }

        System.out.println("在庫数が知りたい消耗品の名前を入力してください");
        try{
            String item = new java.util.Scanner(System.in).nextLine();
            int number = stocks.get(item);
            System.out.println(item + "の在庫数は" + number + "個です");
        } catch (Exception e){
            System.out.println("正しい名前を記入してください");
        }
    }
}
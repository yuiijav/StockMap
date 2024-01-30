package org.example;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> stocks = new HashMap<>();
        stocks.put("トイレットペーパー", 3);
        stocks.put("キッチンペーパー", 4);
        stocks.put("ティッシュペーパー", 8);

        //Mapの中身を表示させる
        for (String key : stocks.keySet()){
            int value = stocks.get(key);
            System.out.println(key + "の在庫数は" + value + "個です");
        }

        //特定の消耗品に対してだけ在庫数を表示させる際に例外を設定
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
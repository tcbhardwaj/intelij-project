package com.contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> bookList = new ArrayList<>();
        List<Integer> borrowList = new ArrayList<>();
        int M = sc.nextInt();
        for(int i = 0; i < M; i++) {
            bookList.add(i, sc.nextInt());
        }
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            borrowList.add(i, sc.nextInt());
        }

        for(int i = 0; i < borrowList.size(); i++) {
            System.out.println(bookList.remove(borrowList.get(i)-1));
        }


    }
}

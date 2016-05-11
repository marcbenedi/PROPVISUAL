package com.prop45.FuncionsAuxiliars;

import java.util.ArrayList;

public class FuncionsAuxiliars {
    public static class Funcions{
        public static <T> ArrayList<T> intersection(ArrayList<T> list1, ArrayList<T> list2) {
            ArrayList<T> list = new ArrayList<T>();

            for (T t : list1) {
                if(list2.contains(t)) {
                    list.add(t);
                }
            }
            return list;
        }
    }
}

package com.stackroute.pe3code;

public class RemoveVowels {

    public String removeVowelFromStrings(String[] array) {

        for (int i = 0; i < array.length; i++) {
            String str = array[i];

            for (int j = 0; j < str.length(); j++) {

                char a = str.charAt(j);
                if (str.charAt(j) == 'a') {
                    str = str.replace("a", "");
                } else if (str.charAt(j) == 'e') {
                    str = str.replace("e", "");
                } else if (str.charAt(j) == 'i') {
                    str = str.replace("i", "");
                } else if (str.charAt(j) == 'o') {
                    str = str.replace("o", "");
                } else if (str.charAt(j) == 'u') {
                    str = str.replace("u", "");
                }
            }
            return str;

        }
        return null;
    }

    public String removeVowelFromStringsExceptFirst(String[] array) {

        for (int i = 0; i < array.length; i++) {
            String strEF = array[i];

            for (int j = 0; j < strEF.length(); j++) {

                char a = strEF.charAt(j);

                if (strEF.charAt(j) == 'a') {
                    strEF = strEF.replace("a", "");
                } else if (strEF.charAt(j) == 'e') {
                    strEF = strEF.replace("e", "");
                } else if (strEF.charAt(j) == 'i') {
                    strEF = strEF.replace("i", "");
                } else if (strEF.charAt(j) == 'o') {
                    strEF = strEF.replace("o", "");
                } else if (strEF.charAt(j) == 'u') {
                    strEF = strEF.replace("u", "");
                }
            }
            return strEF;
        }return null;
    }
}
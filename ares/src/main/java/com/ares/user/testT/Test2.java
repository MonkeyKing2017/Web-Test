package com.ares.user.testT;

/**
 * test1
 *
 * @author monkeyking
 * @create 2017-08-15 19:51
 */
public class Test2 {
    private static final String[] dx = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};

    private static final String[] hz = {"十", "百", "千", "万", "十", "百", "千"};

    private static final String yi = "亿";

    private static final int length = hz.length + 1;

    private static final String dian = "点";

    private static final int chao = -999999;


    public static void main(String[] args) {

        String str = "10003000.05";
        StringBuffer sb = new StringBuffer(str);
        String s = sb.reverse().toString();
        System.out.println("原始数据："+str);
        String convertNumber = convertNumber(s);
        sb = new StringBuffer(convertNumber);
        sb.reverse();
        System.out.println("转换之后:"+sb);
    }

    public static int isReal(String str) {
        int index = 0;
        if (str.contains(".")) {
            index = 0 - str.substring(0, str.indexOf(".")).length();
        }
        return index;
    }

    public static String convertNumber(String str) {
        char[] chars = str.toCharArray();
        int index = isReal(str);
        return convertNumber(chars, index);
    }

    public static String convertNumber(char[] chars, int index) {
        return index < 0 ? convertNumberForDian(chars, index) : convertNumberForInt(chars, index);
    }

    public static String convertNumberForDian(char[] chars, int index) {
        return convertNumberForDian(chars, 0, 0-index, "");
    }

    public static String convertNumberForInt(char[] chars, int index) {
        return convertNumberForInt(chars, 0, 0, "", false,false);
    }

    public static String convertNumberForDian(char[] chars, int curIndex, int xiaoshu, String result) {
        int t = parseInt(chars[curIndex]);
        if (t == chao) {
            result += dian;
            return convertNumberForInt(chars, curIndex+1, 0, result, false,false);
        }
        if (xiaoshu > 0) {
            result += dx[t];
            return convertNumberForDian(chars, curIndex+1, xiaoshu-1, result);
        } else {
            // 此处不会出现
            throw new IllegalArgumentException("parameter is incorrect");
        }

    }

    public static String convertNumberForInt(char[] chars, int curIndex, int zhen, String result, boolean lastZero, boolean firstZero) {
        if (curIndex > chars.length-1) {
            return result;
        }

        int remainder = zhen % length;
        int merchant = zhen / length;

        int index = parseInt(chars[curIndex]);

        if (index == 0) {
            if (zhen == 0) {
                firstZero = true;
            }
            return convertNumberForInt(chars, curIndex+1, zhen+1, result, index == 0, firstZero);
        }

        String realStr = dx[index];

        if (remainder > 0){
            realStr = hz[remainder-1] + realStr;
        }

        if (merchant > 0 && remainder == 0){
            realStr = getRealStr(merchant-1, realStr);
        }

        if (!firstZero) {
            realStr = lastZero ? dx[0] + realStr : realStr;
        } else {
            firstZero = false;
        }

        result = result + realStr;
        return convertNumberForInt(chars, curIndex+1, zhen+1, result, index == 0, firstZero);
    }

    private static String convertNumberForInt(char[] chars, int curIndex, int remainder, int merchant, String result, boolean lastZero){
        int index = parseInt(chars[curIndex]);

        if (index == 0) {
            return result;
        }

        String realStr = dx[index];

        if (remainder > 0){
            realStr = hz[remainder-1] + realStr;
        }

        if (merchant > 0 && remainder == 0){
            realStr = getRealStr(merchant-1, realStr);
        }

        realStr = lastZero ? dx[0] + realStr : realStr;
        return result + realStr;
    }

    private static String getRealStr(int num, String realStr){
        if (num < 0 ){
            return realStr;
        }
        return yi + getRealStr(num-1, realStr);
    }

    private static int parseInt(char c){
        String s = String.valueOf(c);
        if (s.equals(".")) {
            return chao;
        }
        return Integer.parseInt(s);
    }
}

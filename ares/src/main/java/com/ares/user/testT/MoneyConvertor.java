package com.ares.user.testT;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 金钱转换器
 *
 * @author
 * @create 2017-11-20 18:15
 */
public class MoneyConvertor {

	private static final String ZORE = "零";
	private static final String TEN = "十";
	private static final String BAI = "百";
	private static final String QIAN = "千";
	private static final String ZHAO = "兆";

	private static String[] units = {"", "", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千", "兆", "十", "百", "千"};

	private static List<String> list = new ArrayList<String>() {{
		add("亿");
		add("万");
		add("点");
		add(ZORE);
	}};

	private static Map<String, String> mapper;

	static {
		mapper = new HashMap<String, String>();
		mapper.put("0", "零");
		mapper.put("1", "一");
		mapper.put("2", "二");
		mapper.put("3", "三");
		mapper.put("4", "四");
		mapper.put("5", "五");
		mapper.put("6", "六");
		mapper.put("7", "七");
		mapper.put("8", "八");
		mapper.put("9", "九");
		mapper.put(".", "点");
	}

	public static String convert(BigDecimal money) {

		String moneyStr = money.toString();
		moneyStr = reverseStr(moneyStr);
		int index = moneyStr.indexOf(".");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < moneyStr.length(); i++) {

			String temp = mapper.get(String.valueOf(moneyStr.charAt(i)));

			// 小数点后边的位数
			if (i < index) {
				if (isNullOrEmpty(sb.toString()) && ZORE.equals(temp)) continue;
				sb.append(temp);
				continue;
			}

			// 小数点前边的位数
			String unit = units[i - index];
			if (list.contains(temp) && !list.contains(unit)) {
				unit = "";
			}
			sb.append(unit).append(temp);
		}
		return replaceZore(reverseStr(sb.toString()));
	}

	public static String reverseStr(String string) {
		if (string == null || string.length() == 0) return string;
		int length = string.length();
		char[] array = string.toCharArray();
		for (int i = 0; i < length / 2; i++) {
			array[i] = string.charAt(length - 1 - i);
			array[length - 1 - i] = string.charAt(i);
		}
		return new String(array);
	}

	public static String replaceZore(String str) {
		System.out.println(str);
		return str.replaceAll(TEN + ZORE, TEN).replaceAll("[零]+", ZORE).replaceAll(BAI + ZORE, BAI).replaceAll(QIAN + ZORE, QIAN).replaceAll(ZHAO + ZORE, ZHAO);
	}

	public static void main(String[] args) {//一千零一万零一十二万三千点零三一一一二三二零零
		System.out.println(convert(new BigDecimal("10123000.05")));
	}

	private static boolean isNullOrEmpty(String str){
	    return str==null || "".equals(str);
    }
}

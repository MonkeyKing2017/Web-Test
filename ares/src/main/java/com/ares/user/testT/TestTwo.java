package com.ares.user.testT;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class TestTwo {
	private static final String[] dx = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

//    private static final String[] hz = {"拾", "佰", "仟", "万", "拾", "佰", "仟"};
    private static final String[] hz = {"个","十", "百", "千"};
    
    private static final String wan = "万";
    private static final String yi = "亿";
    private static final String dian = "点";

    
    
	@Autowired
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
    	map.put("0", "零");
    	map.put("1", "一");
    	map.put("2", "二");
    	map.put("3", "三");
    	map.put("4", "四");
    	map.put("5", "五");
    	map.put("6", "六");
    	map.put("7", "七");
    	map.put("8", "八");
    	map.put("9", "九");
    	String key = "";
//		String str = "贰壹点仟陆万贰零亿肆拾伍零万叁拾肆佰伍仟陆亿亿柒";
//		System.out.println(new StringBuffer(str).reverse());
        String str = "123000123000.12";//一千二百三十亿零一十二万三千
        String ss = "";
        if (str.contains(".")) {
        	String[] split = str.split("\\.");
        	char[] leftString = split[0].toCharArray();
        	char[] rightString = split[1].toCharArray();
        	int length = leftString.length;
        	int digit = 1;
        	String company = "";
        	for (int i = length-1; i >= 0; i--) {
				System.out.println("i:"+i);
				key = String.valueOf(leftString[i]);
				int quYu = digit % 4;
				int quMu = digit / 4;
				if (quYu != 1) {
					if (quMu > 0 && quYu == 0) {
						company = hz[3];
					}else {
						company = hz[quYu-1];
					}
				}
				if (quMu > 0 && quYu == 1) {
					company = quMu % 2 == 1 ? wan: yi;
				}
				if (!"零".equals(map.get(key))) {
					ss = map.get(key)+ company + ss;
				}
				
				company = "";
				System.out.println("ss:"+ss);
				digit++;
			}
		}else {
			
		}
        System.out.println("结果:"+ss);
//        StringBuffer sb = new StringBuffer(str);
//        String s = sb.reverse().toString();
//        System.out.println("原始数据："+s);
//        String convertNumber = convertNumber(s);
//        sb = new StringBuffer(convertNumber);
//        sb.reverse();
//        System.out.println("转换之后:"+sb);
    }
}

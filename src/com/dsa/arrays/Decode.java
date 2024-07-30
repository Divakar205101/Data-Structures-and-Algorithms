package com.dsa.arrays;

public class Decode {

	    public static void decodeMessage(String mag) {
	        if (mag == null || mag.equals("NULL") || mag.isEmpty()) {
	            System.out.println("NULL");
	            return;
	        }

	        StringBuilder decodedMessage = new StringBuilder();
	        int i = 0;
	        while (i < mag.length()) {
	            if (mag.charAt(i) == '_') {
	                decodedMessage.append(' ');
	                i++;
	            } else if (mag.charAt(i) == '#') {
	                StringBuilder num = new StringBuilder();
	                i++;
	                while (i < mag.length() && Character.isDigit(mag.charAt(i))) {
	                    num.append(mag.charAt(i));
	                    i++;
	                }
	                int asciiValue = Integer.parseInt(num.toString()) + 'A' - 1;
	                decodedMessage.append((char) asciiValue);
	            } else {
	                int asciiValue = Integer.parseInt(String.valueOf(mag.charAt(i))) + 'A' - 1;
	                decodedMessage.append((char) asciiValue);
	                i++;
	            }
	        }

	        System.out.println(decodedMessage.toString().toUpperCase());
	    }

	    public static void main(String[] args) {
	      //  decodeMessage("2#14_18#20_8#5_4_23#15_3_15#14#20_19_20#18#1#9#14_7_8#20_9#14_25#15#21_9#14_19#15#12#9#4#1#18#9#20#25");
	        decodeMessage("24214_3120_@#459");
	        decodeMessage("");
	    }
	

}

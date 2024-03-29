package com.ibm.liquidinfoapp.utils;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

public class CommonUtil {
	/** 
     * 对字符串进行MD5加密 
     *  
     * @param str 
     * @return String 
     */  
    public static String md5Encryption(String str) {  
        String newStr = null;  
        try {  
            MessageDigest md5 = MessageDigest.getInstance("MD5");  
            BASE64Encoder base = new BASE64Encoder();  
            newStr = base.encode(md5.digest(str.getBytes("UTF-8")));  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return newStr;  
    }  
      
  
    /** 
     * 判断字符串是否为空 
     *  
     * @param str 
     *            字符串 
     * @return true：为空； false：非空 
     */  
    public static boolean isNull(String str) {  
        if (str != null && !str.trim().equals("")) {  
            return false;  
        } else {  
            return true;  
        }  
    }
}

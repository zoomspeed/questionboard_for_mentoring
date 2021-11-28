package com.ktds.questionformentoring.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

public class CommonUtil {
    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static String objectArrayToString(Object[] objs) {
        StringBuffer sb = new StringBuffer();

        for(Object obj : objs) {
            sb.append(String.valueOf(obj));
        }
        return sb.toString();
    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();

        int randInt = random.nextInt((max-min));

        return min+randInt;
    }

    public static Properties getProperties(String propPath) {
        File dbPropfile = new File(propPath);

        FileInputStream fis = null;
        Properties props = null;

        try {
            fis = new FileInputStream(dbPropfile);
            props = new Properties();
            props.load(fis);

        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(0);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return props;
    }

    public static boolean isEmpty(String input) {
        return (input == null || input.trim().length() == 0) ? true : false;
    }

    /**
     * nvl 메소드
     * @param inputStr
     * @return
     */
    public static String nvl(String inputStr) {
        return (inputStr != null) ? inputStr.trim() : "";
    }

    /**
     * nvl 메소드
     * @param inputStr
     * @param defaultValue
     * @return
     */
    public static String nvl(String inputStr, String defaultValue) {
        return nvl(inputStr).contentEquals("") ? defaultValue : inputStr.trim();
    }

    /**
     * nvl 메소드
     * @param inputObj
     * @return
     */
    public static String nvl(Object inputObj) {
        return (String) ((inputObj != null) ? String.valueOf(inputObj).trim() : "");
    }
}

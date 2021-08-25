package cn.brave.player.util.common;

import java.util.*;

/**
 * @author Brave
 * @create 2021-08-24 14:06
 * @description
 **/
public class SystemUtils {

    //系统环境变量
    private static final Map<String, String> systemEnv = System.getenv();

    /**
     * 如果是windows系统， 打印出来的值通过从 “我的电脑” 里看到的环境变量是一样的
     * @param key 环境变量名
     * @return
     */
    public static String querySystemEnv(String key) {
        return systemEnv.get(key);
    }

    public static String getSystemEnv(String key) {
        return System.getenv().get(key);
    }

    public static String getSystemProperty(String key) {
        return System.getProperty(key);
    }

    public static String getPlatfrom() {
        return System.getenv("OS").toLowerCase();
    }

}

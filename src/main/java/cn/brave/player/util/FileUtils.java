package cn.brave.player.util;

import java.io.File;

/**
 * @author Brave
 * @create 2021-08-24 13:56
 * @description
 **/
public class FileUtils {

    public static void mkdir(String abspath) {

    }

    public static boolean exists(String path) {
        return false;
    }

    public static boolean isLegal(String path) {
        File file = new File("");
        return true;
    }

    public static void main(String[] args) {
        File file = new File("aa/bb/ccdd?sd");
    }
}

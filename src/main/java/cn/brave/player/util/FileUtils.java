package cn.brave.player.util;

import sun.nio.fs.DefaultFileSystemProvider;
import sun.security.action.GetPropertyAction;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.security.AccessController;

/**
 * @author Brave
 * @create 2021-08-24 13:56
 * @description
 **/
public class FileUtils {

    /**
     * 创建多级目录
     * @param abspath 绝对路径
     */
    public static void mkdir(String abspath) {

    }

    /**
     * 文件是否存在
     * @param path 文件路径
     * @return
     */
    public static boolean exists(String path) {
        return false;
    }

    /**
     * 检测文件路径是否合法
     * @param path 文件路径
     * @return boolean
     */
    public static boolean isPathLegal(String path) {
        return true;
    }

    public static void main(String[] args) {
        isPathLegal("aaa/bbb/ccc");

        new File("");
    }
}

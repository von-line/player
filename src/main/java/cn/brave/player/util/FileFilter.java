package cn.brave.player.util;

import java.io.File;

/**
 * @author Brave
 * @create 2021-08-23 20:26
 * @description
 **/
@FunctionalInterface
public interface FileFilter {
    boolean accept(File file);
}
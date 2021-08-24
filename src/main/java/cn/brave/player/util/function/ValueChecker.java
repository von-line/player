package cn.brave.player.util.function;

/**
 * @author Brave
 * @create 2021-08-24 12:21
 * @description
 **/
@FunctionalInterface
public interface ValueChecker<T> {
    boolean accept(T value);
}
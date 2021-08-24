package cn.brave.player.bean.entity;

import cn.brave.player.bean.AbstractMedia;

import java.io.Serializable;
import java.util.List;

/**
 * @author Brave
 * @create 2021-08-24 15:03
 * @description
 **/
public class Music extends AbstractMedia implements Serializable, Comparable<Music> {

    private String name;
    private List<Singer> singerList;
    private Album album;
    private String totalTime;   //总时长

    @Override
    public int compareTo(Music music) {
        return Integer.compare(this.hashCode(), music.hashCode());
    }

}

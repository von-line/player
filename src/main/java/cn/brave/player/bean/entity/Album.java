package cn.brave.player.bean.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Brave
 * @create 2021-08-24 16:43
 * @description
 **/
@Data
public class Album implements Serializable, Comparable<Album> {

    private String title;                       //专辑名
    private String publishedTime;               //发布时间
    private String description;                 //描述信息
    private Map<String, String> authorInfo;     //作者列表

    @Override
    public int compareTo(Album album) {
        return Integer.compare(this.hashCode(), album.hashCode());
    }
}

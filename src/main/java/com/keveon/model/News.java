package com.keveon.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Keveon on 2017/3/25.
 * News
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class News implements Serializable {
    private static final long serialVersionUID = 5376940703746098961L;

    @Id
    @GeneratedValue
    Long id;

    /**
     * 文章类型
     */
    @Enumerated(EnumType.ORDINAL)
    Type type;

    /**
     * 标题
     */
    @Column(length = 100)
    String title;

    /**
     * 简述
     */
    String description;

    /**
     * 发布日期
     */
    @OrderBy
    @Temporal(TemporalType.DATE)
    Date publishDate;

    /**
     * 内容类型
     */
    @Enumerated(EnumType.ORDINAL)
    ContentType contentType;

    /**
     * 内容
     */
    @Lob
    String content;

    /**
     * 文章类型
     */
    @ToString
    @AllArgsConstructor
    public enum Type {

        ALL(-1, "-- 请选择类型 --"), HOME(1, "主页"), PRODUCTS(2, "产品");

        @Getter
        private int tab;

        @Getter
        private String type;
    }

    /**
     * 内容类型
     */
    @ToString
    @AllArgsConstructor
    public enum ContentType {
        MARKDOWN(1, "Markdown文本编辑器"), SIMDITOR(2, "国产simditor富文本编辑器"), SUMMERNOTE(3, "Wyswig Summernote 富文本编辑器");

        @Getter
        int num;

        @Getter
        String name;
    }
}


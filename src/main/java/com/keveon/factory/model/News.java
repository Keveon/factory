package com.keveon.factory.model;

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

    /**
     * The Id.
     */
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

        /**
         * All type.
         */
        ALL(-1, "-- 请选择类型 --"),
        /**
         * Home type.
         */
        HOME(1, "主页"),
        /**
         * Products type.
         */
        PRODUCTS(2, "产品");

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
        /**
         * Markdown content type.
         */
        MARKDOWN(1, "Markdown文本编辑器"),
        /**
         * Simditor content type.
         */
        SIMDITOR(2, "国产simditor富文本编辑器"),
        /**
         * The Summernote.
         */
        SUMMERNOTE(3, "Wyswig Summernote 富文本编辑器");

        /**
         * The Num.
         */
        @Getter
        int num;

        /**
         * The Name.
         */
        @Getter
        String name;
    }
}


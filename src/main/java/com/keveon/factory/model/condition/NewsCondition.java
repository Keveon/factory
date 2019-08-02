package com.keveon.factory.model.condition;

import com.keveon.factory.model.News;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * Created by Keveon on 2017/3/25.
 * News condition
 */
@Data
@RequiredArgsConstructor
public class NewsCondition implements Serializable {
    private static final long serialVersionUID = 7195467448183044082L;

    /**
     * 类型
     */
    News.Type type;

    /**
     * 标题关键字
     */
    String[] s;

}

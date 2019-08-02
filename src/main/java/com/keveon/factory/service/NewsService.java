package com.keveon.factory.service;

import com.keveon.factory.model.News;
import com.keveon.factory.model.condition.NewsCondition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Keveon on 2017/3/28.
 * News service
 */
public interface NewsService {
    /**
     * 保存新闻信息
     *
     * @param news 新闻内容
     * @return the news
     */
    News save(News news);

    /**
     * 通过新闻id查询新闻信息
     *
     * @param id 新闻编号
     * @return the news
     */
    News findById(Long id);

    /**
     * 通过动态条件及分页条件查询新闻信息
     *
     * @param condition 查询条件
     * @param pageable  分页信息
     * @return 符合条件的新闻信息 page
     */
    Page<News> findByConditionAndPageable(NewsCondition condition, Pageable pageable);
}

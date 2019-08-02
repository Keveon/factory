package com.keveon.factory.service.impl;

import com.keveon.factory.model.News;
import com.keveon.factory.model.condition.NewsCondition;
import com.keveon.factory.repository.NewsRepository;
import com.keveon.factory.service.NewsService;
import com.keveon.factory.utils.Clock;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.StringUtils.hasText;

/**
 * Created by Keveon on 2017/3/28.
 * News service implement
 */
@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {
    private final NewsRepository repository;
    /**
     * The Clock.
     */
// 可注入的Clock，方便测试时控制日期
    protected Clock clock = Clock.DEFAULT;

    @Override
    @Transactional
    public News save(News news) {
        return repository.save(news);
    }

    @Override
    @Transactional(readOnly = true)
    public News findById(Long id) {
        return repository.getOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<News> findByConditionAndPageable(NewsCondition condition, Pageable pageable) {
        return repository.findAll((root, query, cb) -> {
            // 查询条件
            List<Predicate> predicates = new ArrayList<>();

            // 类型
            if (null != condition.getType() && !condition.getType().equals(News.Type.ALL)) {
                predicates.add(cb.equal(root.get("type").as(News.Type.class), condition.getType()));
            }

            // 标题关键字
            String keywords = condition.getS()[1];
            if (hasText(keywords)) {
                List<Predicate> tempPredicates = new ArrayList<>();
                for (String s : keywords.split(",")) {
                    if (hasText(s)) {
                        tempPredicates.add(cb.like(root.get("title").as(String.class), "%" + s + "%"));
                    }
                }

                predicates.add(cb.or(tempPredicates.toArray(new Predicate[0])));
            }

            // 加入条件
            query.where(predicates.toArray(new Predicate[0]));
            return null;
        }, pageable);
    }
}

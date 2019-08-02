package com.keveon.factory.repository;

import com.keveon.factory.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Keveon on 2017/3/28.
 * News repository
 */
public interface NewsRepository extends JpaRepository<News, Long>, JpaSpecificationExecutor<News> {
}

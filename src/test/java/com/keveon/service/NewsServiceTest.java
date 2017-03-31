package com.keveon.service;

import com.keveon.model.News;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by Keveon on 2017/3/28.
 * News service tests
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsServiceTest {

    @Autowired
    private NewsService newsService;
    private News news;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void save() throws Exception {
        for (int i = 1; i <= 500; i++) {
            news = News.builder()
                    .type(0 == i % 2 ? News.Type.HOME : News.Type.PRODUCTS)
                    .title("测试文章标题" + i)
                    .description("测试文章描述" + i)
                    .publishDate(new Date())
                    .contentType(0 == i % 2 ? News.ContentType.MARKDOWN : 0 == i % 3 ? News.ContentType.SIMDITOR : News.ContentType.SUMMERNOTE)
                    .content("测试文章内容" + i)
                    .build();
            newsService.save(news);
        }
    }

    @Test
    public void findById() throws Exception {
        news = newsService.findById(1L);
        System.out.println("news = " + news);
    }
}
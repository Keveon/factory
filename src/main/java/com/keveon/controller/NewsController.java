package com.keveon.controller;

import com.keveon.model.News;
import com.keveon.model.condition.NewsCondition;
import com.keveon.service.NewsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by Keveon on 2017/3/25.
 * .
 */
@Slf4j
@RestController
@RequestMapping("news.html")
@RequiredArgsConstructor
public class NewsController {
    private final NewsService newsService;

    @GetMapping
    public ModelAndView news(HttpSession session) {
        session.setAttribute("types", News.Type.values());
        return new ModelAndView("news");
    }

    @GetMapping(value = "newses", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Page<News>> newsList(@ModelAttribute NewsCondition condition, @PageableDefault Pageable pageable) {
        Page<News> pageNews = newsService.findByConditionAndPageable(condition, pageable);
        pageNews.getContent().forEach((i) -> log.debug("{}", i));
        return new ResponseEntity<>(pageNews, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ModelAndView newsDetail(@PathVariable("id") Long id, HttpSession session) {
        System.out.println("id = " + id);
        session.setAttribute("news", newsService.findById(id));
        return new ModelAndView("news-edit");
    }
}
package com.keveon.factory.controller;

import com.keveon.factory.model.News;
import com.keveon.factory.model.condition.NewsCondition;
import com.keveon.factory.service.NewsService;
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

    /**
     * News model and view.
     *
     * @param session the session
     * @return the model and view
     */
    @GetMapping
    public ModelAndView news(HttpSession session) {
        session.setAttribute("types", News.Type.values());
        return new ModelAndView("news");
    }

    /**
     * News list response entity.
     *
     * @param condition the condition
     * @param pageable  the pageable
     * @return the response entity
     */
    @GetMapping(value = "newses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<News>> newsList(@ModelAttribute NewsCondition condition, @PageableDefault Pageable pageable) {
        Page<News> pageNews = newsService.findByConditionAndPageable(condition, pageable);
        pageNews.getContent().forEach(i -> log.debug("{}", i));
        return new ResponseEntity<>(pageNews, HttpStatus.OK);
    }

    /**
     * News detail model and view.
     *
     * @param id      the id
     * @param session the session
     * @return the model and view
     */
    @GetMapping("/{id}")
    public ModelAndView newsDetail(@PathVariable("id") Long id, HttpSession session) {
        log.debug("id = [{}]", id);
        session.setAttribute("news", newsService.findById(id));
        return new ModelAndView("news-edit");
    }
}
package com.keveon.factory.model;

import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Keveon on 2017/3/24.
 * Location point
 */
@Embeddable
@RequiredArgsConstructor
public class Point implements Serializable {
    private static final long serialVersionUID = 4988511256075568270L;

    /**
     * 经度
     */
    @Column(precision = 13, scale = 10)
    final BigDecimal latitude;

    /**
     * 纬度
     */
    @Column(precision = 13, scale = 10)
    final BigDecimal longitude;

    /**
     * Instantiates a new Point.
     */
    public Point() {
        this(null, null);
    }
}

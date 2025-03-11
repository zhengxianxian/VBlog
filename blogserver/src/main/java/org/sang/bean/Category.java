package org.sang.bean;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * Created by sang on 2017/12/19.
 */
@Getter
@Setter
public class Category {
    private Long id;
    private String cateName;
    private Timestamp date;

    public Category() {
    }
}

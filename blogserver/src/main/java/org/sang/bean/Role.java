package org.sang.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by sang on 2017/12/17.
 */
@Getter
@Setter
public class Role {
    private Long id;
    private String name;

    public Role() {
    }
    public Role(Long id, String name) {

        this.id = id;
        this.name = name;
    }

}

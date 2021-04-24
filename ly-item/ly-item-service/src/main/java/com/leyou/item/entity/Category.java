package com.leyou.item.entity;

import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

/**
 * @author Haiqiao
 * @version 1.0
 * @date 2021/4/24 7:26
 */
@Data
@Table(name = "tb_category")
public class Category {
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;
    private Date createTime;
    private Date updateTime;
}

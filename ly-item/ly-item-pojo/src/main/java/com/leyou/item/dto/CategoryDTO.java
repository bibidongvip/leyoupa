package com.leyou.item.dto;

import lombok.Data;

/**
 * @author Haiqiao
 * @version 1.0
 * @date 2021/4/24 7:26
 */
@Data
public class CategoryDTO {
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;
}

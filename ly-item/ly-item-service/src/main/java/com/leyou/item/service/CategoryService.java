package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.common.utils.BeanHelper;
import com.leyou.item.dto.CategoryDTO;
import com.leyou.item.entity.Category;
import com.leyou.item.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author Haiqiao
 * @version 1.0
 * @date 2021/4/24 7:29
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    public List<CategoryDTO> queryCategoryByParentId(Long pid) {
        Category categoryPojo = new Category();
        categoryPojo.setParentId(pid);
        List<Category> list = this.categoryMapper.select(categoryPojo);
        if(CollectionUtils.isEmpty(list)){
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return BeanHelper.copyWithCollection(list,CategoryDTO.class);

    }

}

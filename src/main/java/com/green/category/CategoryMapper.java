package com.green.category;

import com.green.category.model.CategoryInsDto;
import com.green.category.model.CategorySelvo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<CategorySelvo> selCategory();

    int insCategory(CategoryInsDto dto);

}
package com.green.category;

import com.green.buying.common.ResVo;
import com.green.category.model.CategoryInsDto;
import com.green.category.model.CategorySelvo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service

public class CategoryService {
    private final CategoryMapper CMapper;

    public List<CategorySelvo> selCategory() {
        return CMapper.selCategory();
    }

    public ResVo insCategory(CategoryInsDto dto) {
        CategoryInsDto CategoryDto = CategoryInsDto.builder()
                .categoryNm(dto.getCategoryNm())
                .categoryPk(dto.getCategoryPk())
                .build();

        int result = CMapper.insCategory(CategoryDto);
        log.info("result is : {}", result);
        return new ResVo(result);
    }
}

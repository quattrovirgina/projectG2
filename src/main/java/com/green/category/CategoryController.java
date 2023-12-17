package com.green.category;

import com.green.buying.common.ResVo;
import com.green.category.model.CategoryInsDto;
import com.green.category.model.CategorySelvo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService service;
    @GetMapping
    @Operation(summary="카테고리 목록조회", description = "카테고리 리스트 보기 처리")
    public List<CategorySelvo> getCategory() {
        return service.selCategory();
    }

    @PostMapping
    @Operation(summary = "카데고리 삽입", description = "카데고리 입력")
    public ResVo insCategory(@RequestBody CategoryInsDto dto) {
        return service.insCategory(dto);
    }
}

package com.green.category.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Schema(title= "카테고리 목록 삽입 dto")
public class CategoryInsDto {
    @JsonIgnore
    private int categoryPk;

    private int categoryNm;

}

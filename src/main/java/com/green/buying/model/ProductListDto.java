package com.green.buying.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(title="리스트 응답 dto", description="장바구니 리스트 응답 Dto")
@Data
public class ProductListDto {
    private int userPk;

    private int isList;

    private String CreatedAt;
}

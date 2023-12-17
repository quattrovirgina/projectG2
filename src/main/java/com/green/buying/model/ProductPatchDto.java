package com.green.buying.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;


@Data
@Schema(title="장바구니에서 수정할 목록이 있을 경우 ", description = "장바구니 수정 dto")
@Builder

public class ProductPatchDto {
    @Schema(title="productPrimaryKey")
    private int productPk;
    @Schema(title="ProductName")
    private String productNm;
    @Schema(title="categoryPrimaryKey")
    private int categoryPk;
    @Schema(title="memo")
    private String memo;
}

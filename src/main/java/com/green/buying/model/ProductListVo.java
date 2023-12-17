package com.green.buying.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(title= "리스트 응답 Vo", description="장바구니 리스트 응답 Vo")

public class ProductListVo {
    @Schema(title="productPrimaryKey")
    private int productPk;
    @Schema(title="CategoryName")
    private String categoryNm;
    @Schema(title="ProductName")
    private String ProductNm;
    @Schema(title="Memo")
    private String memo;
    @Schema(title="createdAt")
    private String createdAt;
    @Schema(title="buyingCheck, 0이면 예정, 1이면 확정")
    private int buyingCheck;
    @Schema(title= "CompletedDate")
    private String buyingDate;
}

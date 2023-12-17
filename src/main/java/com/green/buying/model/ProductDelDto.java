package com.green.buying.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(title="장바구니 삭제 DTo", description="장바구니 삭제 dto(한번에 여러개 처리할것)")
public class ProductDelDto {
    private int userPk;

    private List<Integer> productPk;

}

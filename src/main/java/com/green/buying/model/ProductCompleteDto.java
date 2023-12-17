package com.green.buying.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(title="구매확정 Dto", description = "구매확정 등록 dto")
public class ProductCompleteDto {
    private int productPk;
}

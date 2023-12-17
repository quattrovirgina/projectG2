package com.green.buying;

import com.green.buying.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    int insProduct(ProductInsDto dto);

    List<ProductListVo> selProduct(ProductListDto dto);

    int updProduct(ProductPatchDto dto);

    int delProduct(ProductDelDto dto);

    int CompleteProduct(ProductCompleteDto dto);

    // buychecked and hidden pk
    int CheckProduct(ProductDelDto dto);

}

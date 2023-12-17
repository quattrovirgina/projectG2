package com.green.buying;

import com.green.buying.common.ResVo;
import com.green.buying.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductMapper pMapper;

    // 장바구니에 구매할목록 추가
    public ResVo PostIt(ProductInsDto dto) {
        int result = pMapper.insProduct(dto);

        if(result == 0) {
            return new ResVo(0);
        }
        return new ResVo(1);
    }

    // 장바구니 목록 조회
    public List<ProductListVo> getP(ProductListDto dto) {
        return pMapper.selProduct(dto);
    }

    public ResVo putP(ProductPatchDto dto) {
        ProductPatchDto PatchDto = ProductPatchDto.builder()
                .productPk(dto.getProductPk())
                .productNm(dto.getProductNm())
                .categoryPk(dto.getCategoryPk())
                .memo(dto.getMemo())
                .build();

        int result = pMapper.updProduct(PatchDto);

        if(result == 1) {
            return new ResVo(1);
        }
        return new ResVo(0);
    }

    public ResVo completeProduct(ProductCompleteDto dto) {
        int result = pMapper.CompleteProduct(dto);
        if(result == 1) {
            return new ResVo(1);
        }
        return new ResVo(0);
    }

    public ResVo delProduct(ProductDelDto dto) {
        int result = pMapper.delProduct(dto);
        int result2 = pMapper.CheckProduct(dto);

        if(result == 0 && result2 == 0) {
            return new ResVo(0);
        }
        return new ResVo(1);
    }
}

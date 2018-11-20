package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by 廖师兄
 * 2017-05-09 17:33
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}

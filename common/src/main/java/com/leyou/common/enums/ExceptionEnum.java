package com.leyou.common.enums;

import lombok.Getter;

/**
 * @author Haiqiao
 * @version 1.0
 * @date 2021/4/23 9:41
 */
@Getter
public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400, "价格不能为空！"),
    DATA_TRANSFER_ERROR(400,"我也不知道提醒什么好"),
    CATEGORY_NOT_FOUND(204,"分类数据未找到")
    ;
    private int status;
    private String message;

    ExceptionEnum(int status, String message) {
        this.status = status;
        this.message = message;
    }
}

package com.leyou.item.controller;

import com.leyou.item.pojo.Item;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Haiqiao
 * @version 1.0
 * @date 2021/4/23 8:50
 */
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;
    @PostMapping("item")
    public ResponseEntity<Item> saveItem(Item item){
        if(item.getPrice()==null){
            throw new LyException(ExceptionEnum.PRICE_CANNOT_BE_NULL);
        }
        Item result = this.itemService.saveItem(item);
        return ResponseEntity.ok(result);

    }

}

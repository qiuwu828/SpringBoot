package com.example.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品sku表
 * </p>
 *
 * @author hunter
 * @since 2022-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pms_sku")
public class PmsSku implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品spuID(对应商品spu表主键ID)
     */
    private Long spuId;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 商品单位
     */
    private String unit;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 销量
     */
    private Integer sale;

    /**
     * spu中商品规格的对应下标组合
     */
    private String indexes;

    /**
     * 商品sku规格(json格式，反序列化时请使用linkedHashMap，保证有序)
     */
    private String productSkuSpecification;

    /**
     * 默认规格：0->不是；1->是
     */
    private Integer isDefault;

    /**
     * 是否有效，0->无效；1->有效
     */
    private Boolean valid;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改时间
     */
    private Date updatedTime;


}

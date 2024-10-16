package com.example.entity;

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
 * 用户收货地址表
 * </p>
 *
 * @author hunter
 * @since 2022-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_receiver_address")
public class UmsReceiverAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID(对应用户表主键ID)
     */
    private Long userId;

    /**
     * 收件人名称
     */
    private String userName;

    /**
     * 收件人电话
     */
    private String phoneNumber;

    /**
     * 是否为默认收货地址：0->不是；1->是
     */
    private Integer defaultStatus;

    /**
     * 区县id
     */
    private Long countyId;

    /**
     * 详细地址(街道)
     */
    private String detailAddress;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改时间
     */
    private Date updatedTime;

    /**
     * 是否删除（0：否，1：是）
     */
    private Boolean isDelete;


}

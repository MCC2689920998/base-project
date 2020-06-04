package com.mcc.base.service.dao.entity;

import com.mcc.base.service.util.DateUtil;
import com.mcc.base.service.util.UuidUtils;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author MCC
 * @Date 2020/6/4 9:21
 * @Version 1.0
 **/
@Data
public class BaseEntity implements Serializable {

    @Id
    private String id;
    private Date createTime;
    private String createUser;
    private String updateUser;
    private Date updateTime;

    public BaseEntity buildForInsert() {
        this.setId(UuidUtils.base58Uuid());
        this.setCreateTime(DateUtil.currentDate());
        this.setUpdateTime(DateUtil.currentDate());
        return this;
    }

    public BaseEntity buildForUpdate() {
        this.setUpdateTime(DateUtil.currentDate());
        return this;
    }
}

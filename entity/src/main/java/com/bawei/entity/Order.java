package com.bawei.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "order_t")
@Data
@ToString
public class Order implements Serializable {
    @Id
    private String orderId;
    private String chanId;
    private String productId;
    private String chanUserId;
    /**
     * @see com.bawei.entity.enums.OrderType
     */
    private String orderType;
    /**
     * @see com.bawei.entity.enums.OrderStatus
     */
    private String orderStatus;
    private String outerOrderId;
    private String amount;
    private String memo;
    @JsonFormat(pattern = "YYYY-MM-DD HH:mm:ss")
    private Date createAt;
    @JsonFormat(pattern = "YYYY-MM-DD HH:mm:ss")
    private Date updateAt;


}

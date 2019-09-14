package com.bawei.api.domian;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;
@Data
@ToString
@Getter
public class ProductRpcReq {

    private List<String> idList;
    private BigDecimal minRewardRate;
    private BigDecimal maxRewardRate;
    private List<String> statusList;



}

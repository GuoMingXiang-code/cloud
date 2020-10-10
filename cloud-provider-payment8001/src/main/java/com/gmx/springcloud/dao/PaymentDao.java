package com.gmx.springcloud.dao;

import com.gmx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/7 19:47
 * @Version: 1.0
 * @Description:
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

package com.gmx.springcloud.service.impl;

import com.gmx.springcloud.dao.PaymentDao;
import com.gmx.springcloud.entities.Payment;
import com.gmx.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/7 20:09
 * @Version: 1.0
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

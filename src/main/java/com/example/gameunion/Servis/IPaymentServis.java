package com.example.gameunion.Servis;

import com.example.gameunion.DAO.PaymentDao;
import com.example.gameunion.Entity.Payment;

public interface IPaymentServis extends IOrtakServis
{
    Payment createPayment(Payment payment);

    Payment getPayment(Integer paymentId);

    Payment updatePayment(Payment payment);

    void deletePayment(Integer paymentId);

}

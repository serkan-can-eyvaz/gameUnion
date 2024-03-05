package com.example.gameunion.Servis;

import com.example.gameunion.DAO.PaymentDao;
import com.example.gameunion.Entity.Oyun;
import com.example.gameunion.Entity.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServis implements IPaymentServis
{
    private final PaymentDao paymentDao ;

    public PaymentServis(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    public Payment createPayment(Payment payment) {
        return paymentDao.save(payment);
    }

    public Payment getPayment(Integer odemeID) {
        return paymentDao.findById(odemeID).orElse(null);
    }

    public Payment updatePayment(Payment payment) {
        return paymentDao.save(payment);
    }

    public void deletePayment(Integer odemeID) {
        paymentDao.deleteById(odemeID);
    }


    @Override
    public Oyun createGame(Oyun oyun) {
        return null;
    }

    @Override
    public Oyun getGame(Integer gameId) {
        return null;
    }

    @Override
    public Oyun updateGame(Oyun oyun) {
        return null;
    }

    @Override
    public void deleteGame(Integer oyunAdı) {

    }

    @Override
    public List<Oyun> getAllGames() {
        return null;
    }


}

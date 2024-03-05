package com.example.gameunion.Controller;

import com.example.gameunion.Servis.PaymentServis;
import com.example.gameunion.Entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentServis paymentServis;

    @Autowired
    public PaymentController(PaymentServis paymentServis) {
        this.paymentServis = paymentServis;
    }

    @PostMapping("ÖdemeKaydet")
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
        Payment savedPayment = paymentServis.createPayment(payment);
        return new ResponseEntity<>(savedPayment, HttpStatus.CREATED);
    }

    @GetMapping("/{odemeID}")
    public ResponseEntity<Payment> getPayment(@PathVariable Integer odemeID) {
        Payment payment = paymentServis.getPayment(odemeID);
        return payment != null ? ResponseEntity.ok(payment) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{odemeID}")
    public ResponseEntity<Payment> updatePayment(@PathVariable Integer odemeID, @RequestBody Payment payment) {
        Payment updatedPayment = paymentServis.updatePayment(payment);
        return updatedPayment != null ? ResponseEntity.ok(updatedPayment) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{odemeID}")
    public ResponseEntity<Void> deletePayment(@PathVariable Integer odemeID) {
        paymentServis.deletePayment(odemeID);
        return ResponseEntity.noContent().build();
    }


}

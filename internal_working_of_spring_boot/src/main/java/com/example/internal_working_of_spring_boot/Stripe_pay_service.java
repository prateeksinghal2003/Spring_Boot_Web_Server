package com.example.internal_working_of_spring_boot;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider",havingValue = "stripe")
public class Stripe_pay_service implements Payment
{
    @Override
    public String pay() {
        String payment="Stripe payment";
        System.out.println("Payment from "+payment);
        return payment;
    }
}

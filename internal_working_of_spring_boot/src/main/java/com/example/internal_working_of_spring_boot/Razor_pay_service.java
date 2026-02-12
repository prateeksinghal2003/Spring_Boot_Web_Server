package com.example.internal_working_of_spring_boot;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

//public class Razor_pay_service
//{
//    public String pay()
//    {
//        String payment="Razor payment";
//        System.out.println("Payment from "+payment);
//        return payment;
//    }
//}


@Component
//we made it a bean
//using this annotation , bean of the class would be formed.

//making beans on conditions
@ConditionalOnProperty(name="payment.provider",havingValue="razor")
public class Razor_pay_service implements Payment
{
    @Override
    public String pay()
    {
        String payment="Razor payment";
        System.out.println("Payment from "+payment);
        return payment;
    }
}

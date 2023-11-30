package org.example.expert004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Driver {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("expert004/expert004.xml");

       Car car = context.getBean("car", Car.class); // 상품을 구매하는 코드.

       //Tire tire = context.getBean("tire", Tire.class);

       //car.setTire(tire);

       System.out.println(car.getTireBrand());
    }
}

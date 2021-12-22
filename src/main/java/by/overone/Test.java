package by.overone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext contexAudi = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Sound mySoundAudi = contexAudi.getBean("mySound1", Sound.class);
//        mySoundAudi.sound();
//        ClassPathXmlApplicationContext contextTesla = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Sound mySoundTesla = contextTesla.getBean("mySound2", Sound.class);
//        mySoundTesla.sound();
//        Sound audi = new Audi();
//        Driver driver = new Driver(audi);
//        driver.setSound(audi);
//        driver.startingCar();
        ClassPathXmlApplicationContext contexAudi = new ClassPathXmlApplicationContext("applicationContext.xml");
        Driver mySoundAudi = contexAudi.getBean("myDriver", Driver.class);
        mySoundAudi.startingCar();
    }
}

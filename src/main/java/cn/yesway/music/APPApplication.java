package cn.yesway.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.yesway.*")
public class APPApplication {

    public static void main(String[] args) {
        SpringApplication.run(cn.yesway.music.APPApplication.class, args);
    }

}

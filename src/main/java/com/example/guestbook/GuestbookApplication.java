package com.example.guestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // JPA를 이용하면서 AuditingEntityListener를 활성시키기 우해서는 프로젝트에 추가해야 한다.
public class GuestbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestbookApplication.class, args);
    }

}

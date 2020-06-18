package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // 스프링 부트의 자동 설정, 스프링 Bean 일기와 생성을 모두 자동으로 설정₩
public class Application { // 메인 클래스
    public static void main(String[] args) {
        // SpringApplication.run으로 인해 내장 WAS(Tomcat)가 자동으로 실행
        SpringApplication.run(Application.class, args);

        // Tip1. 스프링부트는 내장WAS를 사용하는 것을 권장
        //       그 이유는 '언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있기 때
    }

    // 패지키는 web / domain / service로 구분된다.
    // 1. web : 컨트롤러와 관련된 클래스들을 모두 이 패키지에 등록
}

package com.jojoldu.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // ①
@WebMvcTest(controllers = HelloController.class) // ②
public class HelloControllerTest {

    @Autowired // ➂ 스프링이 관리하는 Bean을 주입 받습니다.
    private MockMvc mvc; // ➃

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))          // ➄
                .andExpect(status().isOk())           // ➅
                .andExpect(content().string(hello));  // ➆
    }
}

/*
 * ① @RunWith(SpringRunner.class)
 *   - 테스트를 진행할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킵니다.
 *   - 여기서는 SpringRunner라는 스프링 실행자를 사용합니다.
 *   - 즉, 스프링 부트 테스트와 JUnit 사이에 연결자 역활을 합니다.₩
 */

/*
 * ➃ private MockMvc mvc
 *   - 웹 API를 테스트할 때 사용합니다.
 *   - 스프링 MVC 테스트의 시작점입니다.
 *   _ 이 클래스를 통해 HTTP GET, POST 등에 대한 API 테스트를 할 수 있습니다.
 */

/*
 * ➄ mvc.perform(get("/hello"))
 *   - MockMvc를 통해 /hello 주소로 HTTP GET 요청을 합니다.
 *   - 체이닝이 지원되어 아래와 같이 여러 검증 기능을 이어서 선언할 수 있습니다.
 */

/*
 * ➅ .andExpect(status().isOk())
 *   - mvc.perform의 결과를 검증합니다.
 *   - HTTP Header의 Status를 검증합니다.
 *   - 우리가 흔히 알고 있는 200, 404, 500 등의 상태를 검증합니다.
 *   - 여기선 OK 즉, 200인지 아닌지를 검증합니다.
 */

/*
 * ➆ .andExpect(content().String(hello))
 *   - mvc.perform의 결과를 검증합니다.
 *   - 응답 본문의 내용을 검증합니다.
 *   - Controller에서 "hello"를 리턴하기 때문에 이 값이 맞는지 검증합니다.
 */
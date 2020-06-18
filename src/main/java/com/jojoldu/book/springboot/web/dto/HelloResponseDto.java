package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // ①
@RequiredArgsConstructor // ②
public class HelloResponseDto {

    private final String name;
    private final int amount;

}

/*
 * ① @Getter
 *    - 선언된 모든 필듸의 get 메소드를 생성해줍니다.
 *    - 예를들면, 기존에는 getName, getAmount 메소드를 생성해야 하지만
 *      @Getter 어노테이션을 선언하면 생성 안해도 자동으로 인식
 */

/*
 * ② RequiredArgsConstructor
 *    - 선언된 모든 final 필드가 포함된 생성자를 생성해 줍니다.
 *    - final이 없는 필드는 생성자에 포함되지 않습니다.
 */
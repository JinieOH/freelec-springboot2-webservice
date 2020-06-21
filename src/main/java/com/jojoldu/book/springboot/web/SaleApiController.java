package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.MemberService;
import com.jojoldu.book.springboot.web.dto.member.MemberResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SaleApiController {
    private final MemberService memberService;

    // 사용자 상세정보 조회
    @GetMapping("/api/v1/member/{id}")
    public MemberResponseDto findById(@PathVariable Long id) {
        return memberService.findById(id);
    }
}

package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.MemberService;
import com.jojoldu.book.springboot.web.dto.member.MemberResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberApiController {

    private MemberService memberService;

    @GetMapping("/api/v1/member/{id}")
    public MemberResponseDto findById(@PathVariable Long id) {
        return memberService.findById(id);
    }
}

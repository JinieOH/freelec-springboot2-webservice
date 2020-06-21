package com.jojoldu.book.springboot.service;

import com.jojoldu.book.springboot.domain.Member.Member;
import com.jojoldu.book.springboot.domain.Member.MemberRepository;
import com.jojoldu.book.springboot.web.dto.member.MemberResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberResponseDto findById(Long id) {
        Member entity = memberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));
        return new MemberResponseDto(entity);
    }
}

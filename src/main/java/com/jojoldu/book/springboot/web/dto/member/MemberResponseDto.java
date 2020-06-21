package com.jojoldu.book.springboot.web.dto.member;

import com.jojoldu.book.springboot.domain.Member.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {

    private Long memSeq;
    private String memID;
    private String memNm;
    private String memNickNm;
    private String zipCode;
    private String addr1;
    private String addr2;
    private String telNo;
    private String hpNo;

    public MemberResponseDto (Member entity) {
        this.memSeq = entity.getMemSeq();
        this.memID = entity.getMemID();
        this.memNm = entity.getMemNm();
        this.memNickNm = entity.getMemNickNm();
        this.zipCode = entity.getZipCode();
        this.addr1 = entity.getAddr1();
        this.addr2 = entity.getAddr2();
        this.telNo = entity.getTelNo();
        this.hpNo = entity.getHpNo();
    }

}

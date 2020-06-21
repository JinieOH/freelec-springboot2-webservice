package com.jojoldu.book.springboot.domain.Member;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memSeq;

    private String memID;
    private String memNm;
    private String memNickNm;
    private String zipCode;
    private String addr1;
    private String addr2;
    private String telNo;
    private String hpNo;

    @Builder
    public Member(String memID, String memNm, String memNickNm, String zipCode, String addr1, String addr2, String telNo, String hpNo) {
        this.memID = memID;
        this.memNm = memNm;
        this.memNickNm = memNickNm;
        this.zipCode = zipCode;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.telNo = telNo;
        this.hpNo = hpNo;
    }

}

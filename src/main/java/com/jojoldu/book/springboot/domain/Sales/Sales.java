package com.jojoldu.book.springboot.domain.Sales;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salID;

    @Column(length = 8, nullable = false)
    private String salDT;

    private String salTitle;
    private String salContent;
    private String salTp;
    private Integer salPrice;
    private String bargaininYN;
    private String memID;

    @Builder
    public Sales(String salID, String salDT, String salTitle, String salContent, Integer salPrice, String bargaininYN, String memID) {
        this.salDT = salDT;
        this.salTitle = salTitle;
        this.salContent = salContent;
        this.salPrice = salPrice;
        this.bargaininYN = bargaininYN;
        this.memID = memID;
    }


}

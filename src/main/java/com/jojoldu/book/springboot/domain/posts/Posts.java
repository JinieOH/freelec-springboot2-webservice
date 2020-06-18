package com.jojoldu.book.springboot.domain.posts;

import javafx.geometry.Pos;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter             // Lombok의 어노테이션
@NoArgsConstructor  // Lombok의 어노테이션
@Entity             // JPA의 어노테이션

// Posts 클래스는 실제 DB의 테이블과 매칭될 클래스
public class Posts {

    // Insert : Setter가 없는 상황에서는 생성자를 통해 최종값을 채운 후 DB에 삽입
    // Update : 해당 이벤트에 맞는 public 메소드를 호출하여 변경

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

}

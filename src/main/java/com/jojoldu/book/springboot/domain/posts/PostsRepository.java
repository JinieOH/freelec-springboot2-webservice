package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// Entity 클래스와 기본 Entity Repository는 함께 위치해야 한다 ★★★
public interface PostsRepository extends JpaRepository {
    // Posts 클래스로 Database를 접근하게 해줄 JpaRepository
    // 보통 ibatis나 MyBatis 등에서 Dao라고 불리는 DB Layer 접근자
}

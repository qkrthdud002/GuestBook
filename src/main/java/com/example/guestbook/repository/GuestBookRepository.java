package com.example.guestbook.repository;

import com.example.guestbook.entity.GuestBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestBookRepository extends JpaRepository<GuestBookEntity, Long> {
}

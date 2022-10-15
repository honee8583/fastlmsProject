package com.zerobase.fastlms.admin.repository;

import com.zerobase.fastlms.admin.entity.LoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long> {
    List<LoginHistory> findByLoginIdOrderByLoginDtDesc(String loginId);
    List<LoginHistory> findByLoginId(String loginId);
}

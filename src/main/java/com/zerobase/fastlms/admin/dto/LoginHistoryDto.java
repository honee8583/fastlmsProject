package com.zerobase.fastlms.admin.dto;

import com.zerobase.fastlms.admin.entity.Category;
import com.zerobase.fastlms.admin.entity.LoginHistory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LoginHistoryDto {

    private long id;
    private String loginId;
    private LocalDateTime loginDt;
    private String userAgent;
    private String clientIp;

    public static LoginHistoryDto of(LoginHistory loginHistory) {
        return LoginHistoryDto.builder()
                .id(loginHistory.getId())
                .loginId(loginHistory.getLoginId())
                .loginDt(loginHistory.getLoginDt())
                .userAgent(loginHistory.getUserAgent())
                .clientIp(loginHistory.getClientIp())
                .build();
    }

    public static List<LoginHistoryDto> of (List<LoginHistory> histories) {
        if (histories != null) {
            List<LoginHistoryDto> historyDtoList = new ArrayList<>();
            for(LoginHistory x : histories) {
                historyDtoList.add(of(x));
            }
            return historyDtoList;
        }

        return null;
    }
    
    public String getLoginDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return loginDt != null ? loginDt.format(formatter) : "";
    }
}

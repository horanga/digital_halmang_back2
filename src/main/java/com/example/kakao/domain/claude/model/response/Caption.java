package com.example.kakao.domain.claude.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Caption {
    private List<String> caption;
}

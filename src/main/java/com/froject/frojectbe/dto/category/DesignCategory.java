package com.froject.frojectbe.dto;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public enum DesignCategory {
    UX_UI("UX·UI"),
    LOGO_BRANDING("로고·브랜딩"),
    PRINTOUT("인쇄물"),
    WEB_DESIGN("웹디자인"),
    PPT_INFO("PPT·인포"),
    ILLUSTRATION("일러스트"),
    VIDEO_3D("영상·3D");

    private final String value;
}

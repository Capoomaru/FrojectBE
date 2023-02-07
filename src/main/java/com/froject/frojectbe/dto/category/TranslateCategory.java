package com.froject.frojectbe.dto.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import utils.EnumMapperType;

@RequiredArgsConstructor
@Getter
public enum TranslateCategory implements EnumMapperType {
    ENGLISH("영어"),
    CHINESE("중국어"),
    JAPANESE("일본어"),
    SPANISH("스페인어"),
    FRENCH("프랑스어"),
    ETC("기타");

    private final String value;

}

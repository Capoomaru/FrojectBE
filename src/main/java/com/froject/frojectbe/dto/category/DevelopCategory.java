package com.froject.frojectbe.dto.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import utils.EnumMapperType;

@Getter
@RequiredArgsConstructor
public enum DevelopCategory implements EnumMapperType {
    MOBILE("모바일"),
    WEB("웹"),
    AI("AI"),
    BIGDATA("빅데이터"),
    EMBEDDED("임베디드"),
    EXCEL_MACRO("엑셀·메크로");

    private final String value;

}

package com.froject.frojectbe.dto.category;

import lombok.Getter;
import lombok.NoArgsConstructor;

public class EnumMapperValue {
    private String value;

    public EnumMapperValue(EnumMapperType enumMapperType) {
        this.value = enumMapperType.getValue();
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return '{' +
                "value = " + value +
        '}';
    }
}

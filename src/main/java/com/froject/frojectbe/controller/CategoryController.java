package com.froject.frojectbe.controller;

import com.froject.frojectbe.dto.BigCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.EnumMapperFactory;
import utils.EnumMapperType;
import utils.EnumMapperValue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class CategoryController {

    private final EnumMapperFactory enumMapperFactory;

    @GetMapping("/categories")
    public Map<String, List<EnumMapperValue>> getCategories() {
        return enumMapperFactory.getAll();
    }

    @GetMapping("/no-bean-category")
    public List<EnumMapperValue> getNoBeanCategories() {
        return Arrays.stream(BigCategory.values())
                .map(EnumMapperValue::new)
                .collect(Collectors.toList());
    }

}

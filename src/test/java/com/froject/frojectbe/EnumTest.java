package com.froject.frojectbe;

import com.froject.frojectbe.dto.BigCategory;
import com.froject.frojectbe.dto.category.DevelopCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import utils.EnumMapperFactory;
import utils.EnumMapperValue;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@ExtendWith(MockitoExtension.class)
public class EnumTest {

//    @Autowired
//    EnumMapperFactory factory;
    
    private EnumMapperFactory getFactory() {
        return new EnumMapperFactory();
    }

    private BigCategory getOrigin() {
        return BigCategory.DEVELOP;
    }

    @Nested
    @DisplayName("EnumFactory 테스트")
    class EnumFactoryTest {
        //given
        EnumMapperFactory factory = null;

        @BeforeEach
        public void setFactory() {
            factory = getFactory();
        }

        @Nested
        @DisplayName("EnumFactory 생성 테스트")
        class SuccessCase {
            @DisplayName("BigCategory 유효성/일치 테스트")
            @Test
            public void BigCategory_테스트() throws Exception {
                //TODO : given/when/then 패턴 공부해서 적용해보기
                //https://github.com/YU-ALGO/algo-be/blob/master/src/test/java/com/algo/yu/algobe/board/application/PostServiceTest.java

                //given
                BigCategory.values();

                //when
                List<EnumMapperValue> bigCategoryElementList = factory.get(BigCategory.class);

                //then
                assertThat(bigCategoryElementList);

            }
        }
    }

    @Test
    public void BigCategory_enum_일치테스트() throws Exception {
        //given
        BigCategory develop = getOrigin();

        //then
        String value = develop.getValue();

        assertThat(develop)
                .isEqualTo(BigCategory.DEVELOP);
        assertThat(value)
                .isEqualTo("개발");
        assertThat(develop.getEnumClass())
                .isEqualTo(DevelopCategory.class);
    }
}

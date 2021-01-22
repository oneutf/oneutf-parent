package com.oneutf.sys.model.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.oneutf.bean.model.bean.Bean;
import com.oneutf.serializer.BigDecimalSerializer;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author yf@jingruit
 */
@Getter
@Setter
public class DemoVO extends Bean {

    @JsonSerialize(using = BigDecimalSerializer.class)
    private BigDecimal bigDecimal;

}

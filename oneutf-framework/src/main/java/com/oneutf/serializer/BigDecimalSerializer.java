package com.oneutf.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * bigDecimal序列化<br>
 * 保留四位小数，四舍五入，去零
 *
 * @author oneutf
 */
public class BigDecimalSerializer extends JsonSerializer<BigDecimal> {

    @Override
    public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.setScale(4, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toPlainString());
    }
}

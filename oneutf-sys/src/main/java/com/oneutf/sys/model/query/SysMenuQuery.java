package com.oneutf.sys.model.query;

import com.oneutf.bean.model.query.BeanQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author oneutf
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SysMenuQuery extends BeanQuery {

    private String code;

    private String name;

    private String url;

    private String pid;
}

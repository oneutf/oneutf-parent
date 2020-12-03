package com.oneutf.file.model.vo;

import com.oneutf.bean.model.vo.BeanVO;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oneutf
 */
@Getter
@Setter
public class FileVO extends BeanVO {

    private String name;

    private String type;

    private String url;
}

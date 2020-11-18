package com.oneutf.file.controller;

import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.JSON;
import com.oneutf.file.model.entity.File;
import com.oneutf.file.model.vo.FileVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author oneutf
 * @desc 文件上传接口
 */
@RestController
@RequestMapping("/file")
public class FileController {

    private String path;

    private String mappingUrl;

    @PostMapping(value = "/upload")
    public FileVo upload(MultipartFile multipartFile) {
        FileVo fileVo = new FileVo();
        String name = multipartFile.getOriginalFilename();
        fileVo.setName(name);
        fileVo.setType(name.substring(name.lastIndexOf(".")));
        String url = path + IdUtil.randomUUID();
        return fileVo;
    }
}

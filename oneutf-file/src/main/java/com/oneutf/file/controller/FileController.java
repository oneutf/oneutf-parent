package com.oneutf.file.controller;

import cn.hutool.core.util.IdUtil;
import com.oneutf.bean.result.Result;
import com.oneutf.bean.result.ResultCode;
import com.oneutf.file.model.vo.FileVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传接口
 *
 * @author oneutf
 */
@RestController
@RequestMapping("/file")
public class FileController {

    @Value(value = "${oneutf.file.path}")
    private String path;

    @Value(value = "${oneutf.file.mappingUrl}")
    private String mappingUrl;

    @PostMapping(value = "/upload")
    public FileVO upload(MultipartFile multipartFile) throws IOException {
        FileVO fileVo = new FileVO();
        String name = multipartFile.getOriginalFilename();
        fileVo.setName(name);
        fileVo.setType(name != null ? name.substring(name.lastIndexOf(".")) : null);
        String fileName = IdUtil.randomUUID() + name;
        fileVo.setUrl(mappingUrl + fileName);
        File file = new File(path + fileName);
        multipartFile.transferTo(file);
        return fileVo;
    }
}



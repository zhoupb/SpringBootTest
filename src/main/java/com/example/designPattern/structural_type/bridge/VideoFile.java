package com.example.designPattern.structural_type.bridge;

/**
 * @author: zhoupb
 * @Description: 视频文件(实现化角色)
 * @since: version 1.0
 */
public interface VideoFile {

    /**
     * 解码功能
     */
    void decode(String fileName);
}

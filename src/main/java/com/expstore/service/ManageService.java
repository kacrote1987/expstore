package com.expstore.service;

import com.expstore.entity.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ManageService {
    String login(String userCode,String userPwd);
    String fileUpload(@RequestParam MultipartFile file,Long noticeId);
    void noticeAdd(NoticeNewForm params);
    void noticeEdit(NoticeDetForm params);
    void noticeDel(Long noticeId);
    void infoEdit(InfoDetForm params);
    String minioUpload(@RequestParam MultipartFile file);
    List<UrlListForm> minioUploadMultip(@RequestParam MultipartFile[] files);
    FileListForm honorUpload(@RequestParam String fileName, @RequestParam MultipartFile file);
}

package com.expstore.controller.home;

import com.expstore.entity.*;
import com.expstore.service.ManageService;
import com.expstore.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "后台管理")
@RestController
@RequestMapping("/manage")
public class ManageController {
    @Resource
    ManageService manageService;

    @ApiOperation("登陆")
    @GetMapping("/login")
    public Result login(@RequestParam String userCode, @RequestParam String userPwd) {
        String token= manageService.login(userCode,userPwd);
        return Result.success(token);
    }

//    @ApiOperation("附件上传")
//    @PostMapping("/fileupload")
//    public Result fileUpload(@RequestParam MultipartFile file,Long noticeId){
//        String fileLink = manageService.fileUpload(file,noticeId);
//        return Result.success(fileLink);
//    }

    @ApiOperation("通知新增")
    @PostMapping("/noticeAdd")
    public Result noticeAdd(@RequestBody NoticeNewForm params){
        manageService.noticeAdd(params);
        return Result.success();
    }

    @ApiOperation("通知修改")
    @PostMapping("/noticeEdit")
    public Result noticeEdit(@RequestBody NoticeDetForm params){
        manageService.noticeEdit(params);
        return Result.success();
    }

    @ApiOperation("通知删除")
    @GetMapping("/noticeDel")
    public Result noticeDel(@RequestParam Long noticeId){
        manageService.noticeDel(noticeId);
        return Result.success();
    }

    @ApiOperation("关于我们修改")
    @PostMapping("/infoEdit")
    public Result infoEdit(@RequestBody InfoDetForm params){
        manageService.infoEdit(params);
        return Result.success();
    }

    @ApiOperation("minio上传")
    @PostMapping("/minioUpload")
    public Result minioUpload(@RequestParam MultipartFile file){
        String url= manageService.minioUpload(file);
        return Result.success(url);
    }

    @ApiOperation("minio批量上传")
    @PostMapping("/minioUploadMultip")
    public Result minioUploadMultip(@RequestParam MultipartFile[] files){
        List<UrlListForm> urlList= manageService.minioUploadMultip(files);
        return Result.success(urlList);
    }

    @ApiOperation("荣誉证书上传")
    @PostMapping("/honorUpload")
    public Result honorUpload(@RequestParam String fileName,@RequestParam MultipartFile file){
        FileListForm honorList= manageService.honorUpload(fileName,file);
        return Result.success(honorList);
    }
}

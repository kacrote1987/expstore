package com.expstore.impl;

import com.expstore.entity.*;
import com.expstore.mapper.HomeMapper;
import com.expstore.service.HomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Resource
    HomeMapper homeMapper;

    @Override
    public List<NoticeListForm> noticeList(Long typeId) {
        List<NoticeListForm> noticeList=homeMapper.noticeList(null,typeId);
        for(int i=0;i<noticeList.size();i++){
            noticeList.get(i).setFileLink(homeMapper.selOneFileLink(noticeList.get(i).getNoticeId()));
        }
        return noticeList;
    }

    @Override
    public NoticeDetForm noticeDet(Long typeId,Long noticeId) {
        NoticeDetForm noticeDet = homeMapper.noticeDet(typeId,noticeId);
        List<FileListForm> fileList = homeMapper.selFileList(noticeId);
        noticeDet.setFileList(fileList);
        return noticeDet;
    }

    @Override
    public InfoDetForm infoDet() {
        InfoDetForm infoDet = homeMapper.infoDet();
        return infoDet;
    }

    @Override
    public List<HonorListForm> honorList() {
        List<HonorListForm> honorList = homeMapper.honorList();
        return honorList;
    }

}

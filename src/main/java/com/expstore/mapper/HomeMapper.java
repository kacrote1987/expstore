package com.expstore.mapper;

import com.expstore.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomeMapper {
    List<NoticeListForm> noticeList(String noticeName,Long typeId);
    String selOneFileLink(Long noticeId);
    NoticeDetForm noticeDet(Long typeId,Long noticeId);
    List<FileListForm> selFileList(Long noticeId);
    InfoDetForm infoDet();
    List<HonorListForm> honorList();
}

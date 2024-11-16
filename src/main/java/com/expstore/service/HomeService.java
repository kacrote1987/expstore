package com.expstore.service;

import com.expstore.entity.HonorListForm;
import com.expstore.entity.InfoDetForm;
import com.expstore.entity.NoticeDetForm;
import com.expstore.entity.NoticeListForm;

import java.util.List;

public interface HomeService {
    List<NoticeListForm> noticeList(Long typeId);
    NoticeDetForm noticeDet(Long typeId,Long noticeId);
    InfoDetForm infoDet();
    List<HonorListForm> honorList();
}

package com.expstore.mapper;

import com.expstore.entity.InfoDetForm;
import com.expstore.entity.NoticeDetForm;
import com.expstore.entity.NoticeNewForm;
import com.expstore.entity.UserListForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ManageMapper {
    UserListForm login(String userCode, String userPwd);
    boolean insertNotice(@Param("params") NoticeNewForm params);
    Long selNewNoticeId(String noticeName);
    boolean insertFile(String fileLink,Long noticeId);
    boolean updateNotice(@Param("params") NoticeDetForm params);
    boolean deleteFile(Long noticeId);
    boolean updateFile(@Param("params") NoticeDetForm params);
    Long checkNoticeId(Long noticeId);
    boolean deleteNotice(Long noticeId);
    boolean updateInfo(@Param("params") InfoDetForm params);
    boolean insertHonor(String fileName,String url);
    Long getHonorIdByUrl(String url);
}

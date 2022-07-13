package com.ty.service;

import com.ty.domain.http.ResponseResult;
import com.ty.domain.vo.TagVo;

import java.util.List;

public interface TagService {


    List<TagVo> findTagsByArticleId(Long articleId);

    ResponseResult hots(int limit);
}

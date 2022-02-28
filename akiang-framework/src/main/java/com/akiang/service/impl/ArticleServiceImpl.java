package com.akiang.service.impl;

import com.akiang.domain.entity.Article;
import com.akiang.mapper.ArticleMapper;
import com.akiang.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author: ziluolan
 * @Date: 2022/2/28 16:41
 */

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}

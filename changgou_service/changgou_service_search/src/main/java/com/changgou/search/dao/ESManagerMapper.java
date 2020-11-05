package com.changgou.search.dao;

import com.changgou.search.pojo.SkuInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

//类似 mybits 的通用mapper
public interface ESManagerMapper extends ElasticsearchRepository<SkuInfo,Long> {
}

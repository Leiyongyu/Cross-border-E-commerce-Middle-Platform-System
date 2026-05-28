package com.asinking.com.openapi.service;

import com.asinking.com.openapi.common.response.PageResult;
import com.asinking.com.openapi.dto.request.BrandOwnerCreateRequest;
import com.asinking.com.openapi.dto.request.BrandOwnerUpdateRequest;
import com.asinking.com.openapi.dto.response.BrandOwnerResponse;
import com.asinking.com.openapi.entity.BrandOwnerEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 品牌归属业务接口，管理 brand_owner 表的 CRUD 及分页查询。
 */
public interface BrandOwnerService extends IService<BrandOwnerEntity> {

    BrandOwnerResponse create(BrandOwnerCreateRequest req);

    BrandOwnerResponse update(Integer id, BrandOwnerUpdateRequest req);

    BrandOwnerResponse detail(Integer id);

    PageResult<BrandOwnerResponse> page(long page, long size, String brandCode, String ownerName);

    /** 查询所有去重的品牌编码 */
    List<String> listDistinctBrandCodes();

    /** 查询所有去重的负责人名称 */
    List<String> listDistinctOwnerNames();
}

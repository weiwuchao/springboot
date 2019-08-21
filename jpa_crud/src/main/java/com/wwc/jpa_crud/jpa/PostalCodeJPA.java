package com.wwc.jpa_crud.jpa;

import com.wwc.jpa_crud.base.BaseRepository;
import com.wwc.jpa_crud.domain.PostalCode;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PostalCodeJPA extends BaseRepository {


    @Query(value = "select * from prac_postalcode where PostalCode =?1",nativeQuery = true)
    public List<PostalCode> findByCode(String code);

    /**
     * 增加、删除、更新操作需要@Modifying,@Query配合使用
     * @param code
     * @return
     */
    @Transactional
    @Modifying
    @Query(value = "delete  from prac_postalcode where PostalCode =?1",nativeQuery = true)
    public void deleteByCode(String code);
}

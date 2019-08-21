package com.wwc.interceptor.jpa;


import com.wwc.interceptor.domain.PostalCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface PostalCodeJPA extends JpaRepository<PostalCode,Integer>,
        JpaSpecificationExecutor<PostalCode>, Serializable {

}

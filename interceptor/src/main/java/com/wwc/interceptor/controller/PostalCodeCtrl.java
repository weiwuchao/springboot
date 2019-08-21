package com.wwc.interceptor.controller;


import com.wwc.interceptor.domain.PostalCode;
import com.wwc.interceptor.jpa.PostalCodeJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/postalcode")
public class PostalCodeCtrl {

    @Autowired
    private PostalCodeJPA postalCodeJPA;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<PostalCode> getPoatalCode(){

        return postalCodeJPA.findAll();
    }

    @RequestMapping(value = "/list/{id}",method = RequestMethod.GET)
    public Optional<PostalCode> getPoatalCodeById(@PathVariable("id") int id){

        return postalCodeJPA.findById(id);
    }

    /**
     * 在save里传入实体id，会去更新该实体
     * @param request
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public PostalCode getPoatalCodeById(HttpServletRequest request){

        String cityName=request.getParameter("cityName");
        String cityId=request.getParameter("cityId");
        String cityNameSub=request.getParameter("cityNameSub");
        String postalCode=request.getParameter("postalCode");
        int id=Integer.valueOf(request.getParameter("id"));
        PostalCode postalCode1=new PostalCode();
        postalCode1.setCityId(cityId);
        postalCode1.setCityName(cityName);
        postalCode1.setCityNameSub(cityNameSub);
        postalCode1.setPostalCode(postalCode);
        postalCode1.setId(id);
        return postalCodeJPA.save(postalCode1);
    }

    //http://localhost:8080/postalcode/add?id=2&postalCode="123"&cityNameSub="123"&cityId="123"&cityName="123"
}

package com.wwc.jpa_crud.controller;

import com.wwc.jpa_crud.domain.PostalCode;
import com.wwc.jpa_crud.jpa.PostalCodeJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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


    /**
     * 自定义SQL根据邮编查询区县信息
     * @param code
     * @return
     */
    @RequestMapping(value = "/listbycode/{code}",method = RequestMethod.GET)
    public List<PostalCode> getPoatalCodeByCode(@PathVariable("code") String code){

        return postalCodeJPA.findByCode(code);
    }

    /**
     * 自定义SQL删除邮编信息
     * @param code
     * @return
     */
    @RequestMapping(value = "/delete/{code}",method = RequestMethod.GET)
    public String deleteByCode(@PathVariable("code") String code){

         postalCodeJPA.deleteByCode(code);
         return "删除成功";
    }

    /**
     * 分页查询
     * @param page
     * @return
     */
    @RequestMapping(value = "/page/{page}",method = RequestMethod.GET)
    public List<PostalCode> findByPage(@PathVariable("page") int page){

        PostalCode postalCode=new PostalCode();
        postalCode.setPage(page);
        postalCode.setSize(10);
        //创建分页对象
        PageRequest pageRequest=new PageRequest(postalCode.getPage(),postalCode.getSize());
        //执行分页查询
        return postalCodeJPA.findAll(pageRequest).getContent();
    }

}

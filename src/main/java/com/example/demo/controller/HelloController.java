//package com.example.demo.controller;
//
//import com.example.demo.entity.Account;
//import com.example.demo.entity.UserEntity;
//import com.example.demo.mapper.AccountMapper;
//import com.example.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * @author DUAN
// * @date 2019/1/13
// */
//@RestController
//public class HelloController {
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private AccountMapper accountMapper;
//
//    @RequestMapping("/")
//    public List<UserEntity> hello(){
//        List<UserEntity> users = userService.list(null);
//        return users;
//    }
//
//    @RequestMapping("/insert")
//    public Integer save(){
//        Account account=new Account();
//        account.setMoney(500);
//        account.setName("dzh");
//        return accountMapper.insert(account);
//    }
////
////    @RequestMapping("/deleteByID")
////    public Integer deleteByid(){
////        return userMapper.deleteById(1);
////    }
////
////    @RequestMapping("/deleteByName")
////    public Integer deleteByName(){
////        Map<String,Object> param=new HashMap<>(16);
////        param.put("name","dzh");
////        return userMapper.deleteByMap(param);
////    }
////
////    @RequestMapping("/deleteBatch")
////    public Integer deleteBatch(){
////        List<Long> ids=new ArrayList<>();
////        ids.add(1084355328282157058L);
////        ids.add(1084355335899013121L);
////        return userMapper.deleteBatchIds(ids);
////    }
////
////    @RequestMapping("/updateByID")
////    public Integer updateByID(){
////        User user=new User();
////        user.setId(4L);
////        user.setName("sjr");
////        return userMapper.updateById(user);
////    }
////
////    @RequestMapping("/update")
////    public Integer update(){
////        User user=new User();
////        user.setName("bbb");
////        user.setAge(18);
////        Map<String,Object> param=new HashMap<>(16);
////        param.put("name","aaa");
////        param.put("age",23);
//////        UpdateWrapper wrapper=new UpdateWrapper();
//////        wrapper.eq("name","dzh");
////        List<Integer> ids=new ArrayList<>();
////        ids.add(1);
////        ids.add(2);
////        ids.add(3);
////        return userMapper.update(user,new UpdateWrapper<User>().allEq(
////                param).in("id",ids));
////    }
//
//    @RequestMapping("/count")
//    public int count(){
//        return userService.count();
//    }
//
//    @RequestMapping("/getAll")
//    public List<UserEntity> all(){
//        return userService.getAll();
//    }
//}

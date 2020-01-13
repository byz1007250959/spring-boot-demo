package com.example.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

/**
 * @author DUAN
 * @date 2019/1/14
 */
public class CodeGenerator {

    public static void main(String[] args) {

        //输出路径
        String outputPath="E:\\out";
        //作者
        String authName="dzh";
        //包名全路径
        String packageNameParent="com.sprucetec.slc";
        //模块名称
        String moduleName="service";
        // 对应表
        String[] tableName = {"t_owner_sku"};
        //数据库url
        String dbUrl = "jdbc:mysql://localhost:3307/test?useUnicode=true&useSSL=false&characterEncoding=utf8";
        //数据库用户名
        String dbUserName = "root";
        //密码
        String dbPassword = "BYZdzh3613";
        //驱动程序
        String dbDriver = "com.mysql.jdbc.Driver";
        //数据库类型
        DbType dbType = DbType.MYSQL;

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(packageNameParent);
        pc.setModuleName(moduleName);
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("dao");
        pc.setXml("dao.xml");
        pc.setEntity("entity");

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(dbUrl);
        dsc.setDriverName(dbDriver);
        dsc.setUsername(dbUserName);
        dsc.setPassword(dbPassword);
        dsc.setDbType(dbType);

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        // 是否大写命名
        strategyConfig.setCapitalMode(true);
        //表名前缀
        strategyConfig.setTablePrefix("t_");
        // 数据库表映射到实体的命名策略
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        // 数据库表字段映射到实体的命名策略, 未指定按照 naming 执行
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        // 需要包含的表名
        strategyConfig.setInclude(tableName);

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setFileOverride(true);
        gc.setOutputDir(outputPath);
        gc.setAuthor(authName);
        gc.setOpen(false);
        gc.setEntityName("%sEntity");
        gc.setMapperName("%sDao");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setXmlName("%sDao");

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        mpg.setGlobalConfig(gc);
        mpg.setDataSource(dsc);
        mpg.setPackageInfo(pc);
        mpg.setStrategy(strategyConfig);
        mpg.setTemplateEngine(new VelocityTemplateEngine());
        mpg.execute();
    }

}

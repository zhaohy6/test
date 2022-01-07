package com.example.demo;

import org.mybatis.generator.api.ShellRunner;

public class MybatisMain {
    public static void main(String[] args) {

        String config = MybatisMain.class.getClassLoader()
                .getResource("generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite" };
        ShellRunner.main(arg);
    }
}

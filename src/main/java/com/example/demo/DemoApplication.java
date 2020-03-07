package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//主配置类，一个jar包只能有一个，也是入口类，springboot，通过@SpringBootApplication的方式来声明
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

//打包完成后通过java -jar 包名         的方式启动jar包
/*必须配置：放在pom.xml配置文件里边
<build>
	<plugins>
		<plugin>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-maven-plugin</artifactId>
		</plugin>
	</plugins>
</build>*/

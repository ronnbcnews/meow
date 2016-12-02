package com.webops.jenkins.spring

import com.webops.jenkins.spring.config.GitHubConfig
import com.webops.jenkins.spring.config.GitHubProperties
import org.springframework.boot.autoconfigure.*
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.*
import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.*
import org.springframework.context.ApplicationContext
import org.springframework.context.*
import org.springframework.context.support.*
import org.yaml.snakeyaml.Yaml
import groovy.lang.GroovyClassLoader

//@Configurable
@Component('com.webops.jenkins.spring.config')
//@EnableAutoConfiguration
@EnableConfigurationProperties(GitHubProperties.class)
//@ComponentScan(['com.webops.jenkins.spring', 'com.webops.jenkins.spring.config'])
public class Meow {
  final Map<String, String> DEFAULT_PROPS = [
      'spring.config.location' : 'resources',
      'spring.application.name': 'meow',
      'spring.main.banner-mode' : 'off',
      'spring.config.name'     : 'application,${spring.application.name}'
  ]


  ApplicationContext context = new ClassPathXmlApplicationContext("file:///C:/Program%20Files%20(x86)/Jenkins/workspace/NBC%20DSL%20APPROACH/src/main/resources/ApplicationContext.xml");
  void main() {
    def classLoader = new GroovyClassLoader()
    classLoader.getURLs().each { url->
      println "- ${url.toString()}"
    }
    //GitHubConfig p1 = (GitHubConfig) context.getBean("gitHubConfig");
    //System.out.println(p1.main());
  }}

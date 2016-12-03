package com.webops.jenkins.spring

import com.webops.jenkins.spring.config.GitHubConfig
import com.webops.jenkins.spring.config.GitHubProperties
import org.springframework.boot.autoconfigure.*
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.*
import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.InputStreamResource
import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.*
import org.springframework.context.ApplicationContext
import org.springframework.context.*
import org.springframework.context.support.*
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.yaml.snakeyaml.Yaml
import jenkins.*
import jenkins.model.*
import hudson.*
import hudson.model.*
import groovy.lang.GroovyClassLoader

//@Configurable
@Component('com.webops.jenkins.spring.config')
//@EnableAutoConfiguration
@EnableConfigurationProperties(GitHubProperties.class)
//@ComponentScan(['com.webops.jenkins.spring', 'com.webops.jenkins.spring.config'])
public class Meow {

  ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:ApplicationContext.xml");
  void main() {
    def classLoader = new GroovyClassLoader()
    classLoader.getURLs().each { url->
      println("inside: - ${url.toString()}")
    }
    //GitHubConfig p1 = (GitHubConfig) context.getBean("gitHubConfig");
    //System.out.println(p1.main());
  }}
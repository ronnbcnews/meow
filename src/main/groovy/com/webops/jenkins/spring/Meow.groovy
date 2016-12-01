package com.webops.jenkins.spring

import com.webops.jenkins.spring.config.GitHubProperties
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration
//import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration
//import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.*
import org.springframework.beans.factory.annotation.*
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.autoconfigure.web.*
import org.yaml.snakeyaml.Yaml

@Configurable
@Component('com.webops.jenkins.spring.config')
//@EnableAutoConfiguration(exclude = [ WebMvcAutoConfiguration.class, WebClientAutoConfiguration.class,
//    HttpMessageConvertersAutoConfiguration.class, GroovyTemplateAutoConfiguration.class])
//@EnableConfigurationProperties(GitHubProperties.class)
//@ComponentScan(['com.webops.jenkins.spring', 'com.webops.jenkins.spring.config'])
public class Meow {
  final Map<String, String> DEFAULT_PROPS = [
    'spring.config.location' : 'resources',
    'spring.application.name': 'meow',
    'spring.main.banner-mode' : 'off',
    'spring.config.name'     : 'application,${spring.application.name}'
  ]

  @Autowired
  private ApplicationContext applicationContext;

  void main() {
    println "started: ${System.getProperty('user.home')} "
  }

}

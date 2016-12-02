package com.webops.jenkins.spring.config

//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
import org.springframework.beans.factory.annotation.*


@Configurable
//@ConditionalOnProperty('github.enabled')
@EnableConfigurationProperties(GitHubProperties)
class GitHubConfig {

  private String baseUrl;
  private int accessToken;

  String getBaseUrl() {
    return baseUrl
  }

  int getAccessToken() {
    return accessToken
  }

  void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl
  }

  void setAccessToken(int accessToken) {
    this.accessToken = accessToken
  }

  public main() {
    return this.baseUrl
  }
}
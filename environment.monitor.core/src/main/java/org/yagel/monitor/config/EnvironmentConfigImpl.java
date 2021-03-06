package org.yagel.monitor.config;

import org.yagel.monitor.EnvironmentConfig;

import java.util.Map;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EnvironmentConfigImpl implements EnvironmentConfig {

  private String evnName;
  private long taskDelay;
  private String host;
  private int appVersion;
  @XmlElementWrapper(name = "checkedResources")
  @XmlElement(name = "resource")
  private Set<String> checkedResources;
  private Map<String, String> additionalProperties;


  @Override
  public String getEnvName() {
    return this.evnName;
  }

  @Override
  public String getHost() {
    return this.host;
  }

  @Override
  public long getTaskDelay() {
    return taskDelay;
  }

  @Override
  public int getAppVersion() {
    return appVersion;
  }


  @Override
  public Set<String> getCheckResources() {
    return this.checkedResources;
  }

  @Override
  public Map<String, String> getAdditionalProperties() {
    return this.additionalProperties;
  }
}

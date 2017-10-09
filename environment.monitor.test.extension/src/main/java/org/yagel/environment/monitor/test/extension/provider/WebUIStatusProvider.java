package org.yagel.environment.monitor.test.extension.provider;


import org.yagel.monitor.EnvironmentConfig;
import org.yagel.monitor.Resource;
import org.yagel.monitor.resource.ResourceImpl;

public class WebUIStatusProvider extends AbstractResourceStatusProvider {

  public WebUIStatusProvider(EnvironmentConfig config) {
    super(config);
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public Resource getResource() {
    return new ResourceImpl("WebUI", "Web Site Web UI");
  }
}

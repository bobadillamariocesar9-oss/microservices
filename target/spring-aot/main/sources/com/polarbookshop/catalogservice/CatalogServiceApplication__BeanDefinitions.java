package com.polarbookshop.catalogservice;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CatalogServiceApplication}.
 */
@Generated
public class CatalogServiceApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'catalogServiceApplication'.
   */
  public static BeanDefinition getCatalogServiceApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CatalogServiceApplication.class);
    beanDefinition.setTargetType(CatalogServiceApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(CatalogServiceApplication.class);
    beanDefinition.setInstanceSupplier(CatalogServiceApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}

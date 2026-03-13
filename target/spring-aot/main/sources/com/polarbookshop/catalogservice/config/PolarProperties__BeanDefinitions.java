package com.polarbookshop.catalogservice.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PolarProperties}.
 */
@Generated
public class PolarProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'polarProperties'.
   */
  public static BeanDefinition getPolarPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PolarProperties.class);
    beanDefinition.setInstanceSupplier(PolarProperties::new);
    return beanDefinition;
  }
}

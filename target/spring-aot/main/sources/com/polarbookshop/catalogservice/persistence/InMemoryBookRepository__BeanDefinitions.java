package com.polarbookshop.catalogservice.persistence;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link InMemoryBookRepository}.
 */
@Generated
public class InMemoryBookRepository__BeanDefinitions {
  /**
   * Get the bean definition for 'inMemoryBookRepository'.
   */
  public static BeanDefinition getInMemoryBookRepositoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(InMemoryBookRepository.class);
    beanDefinition.setInstanceSupplier(InMemoryBookRepository::new);
    return beanDefinition;
  }
}

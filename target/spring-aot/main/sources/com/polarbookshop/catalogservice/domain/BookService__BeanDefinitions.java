package com.polarbookshop.catalogservice.domain;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BookService}.
 */
@Generated
public class BookService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'bookService'.
   */
  private static BeanInstanceSupplier<BookService> getBookServiceInstanceSupplier() {
    return BeanInstanceSupplier.<BookService>forConstructor(BookRepository.class)
            .withGenerator((registeredBean, args) -> new BookService(args.get(0)));
  }

  /**
   * Get the bean definition for 'bookService'.
   */
  public static BeanDefinition getBookServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BookService.class);
    beanDefinition.setInstanceSupplier(getBookServiceInstanceSupplier());
    return beanDefinition;
  }
}

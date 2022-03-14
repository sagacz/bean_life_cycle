package com.spring.lifecycle;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

import org.slf4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LibraryManager implements BeanNameAware, BeanClassLoaderAware,
        BeanFactoryAware, InitializingBean, DisposableBean {
    private final static Logger logger = LoggerFactory.getLogger(LibraryManager.class);
    private String beanName;



    @Override
    public void setBeanName(String name) {
        beanName = name;
        logger.info("Name of  the bean: " + beanName);

    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        logger.info("Classloader instance passed");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("BeanFactory instance passed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("Properties are set");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("Method destroy has been called");
    }

    @PostConstruct
    public void exampleConstructMethod() {
        logger.info("Method with @PostConstruct annotation");
    }

    @PreDestroy
    public void exampleDestroyMethod() {
        logger.info("Method with @PreDestroy annotation");
    }

}

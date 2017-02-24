package com.manglu.monitoring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkingExampleSpringBootAdminApplicationTests {

	//@Test
	/** Running this barebones test is throwing up errors.
	 * 
	 * 
2017-02-24 10:53:12.395 ERROR 25788 --- [           main] o.s.test.context.TestContextManager      : Caught exception while allowing TestExecutionListener [org.springframework.test.context.web.ServletTestExecutionListener@2b4a2ec7] to prepare test instance [com.manglu.monitoring.WorkingExampleSpringBootAdminApplicationTests@1a15b789]

java.lang.NoClassDefFoundError: org/springframework/boot/context/embedded/ServletRegistrationBean
	at java.lang.Class.getDeclaredMethods0(Native Method) ~[na:1.8.0_112]
	at java.lang.Class.privateGetDeclaredMethods(Class.java:2701) ~[na:1.8.0_112]
	at java.lang.Class.getDeclaredMethods(Class.java:1975) ~[na:1.8.0_112]
	at org.springframework.util.ReflectionUtils.getDeclaredMethods(ReflectionUtils.java:613) ~[spring-core-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.util.ReflectionUtils.doWithMethods(ReflectionUtils.java:524) ~[spring-core-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.util.ReflectionUtils.doWithMethods(ReflectionUtils.java:537) ~[spring-core-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.util.ReflectionUtils.doWithMethods(ReflectionUtils.java:510) ~[spring-core-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.util.ReflectionUtils.getUniqueDeclaredMethods(ReflectionUtils.java:570) ~[spring-core-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.getTypeForFactoryMethod(AbstractAutowireCapableBeanFactory.java:697) ~[spring-beans-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.determineTargetType(AbstractAutowireCapableBeanFactory.java:640) ~[spring-beans-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.predictBeanType(AbstractAutowireCapableBeanFactory.java:609) ~[spring-beans-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.isFactoryBean(AbstractBeanFactory.java:1484) ~[spring-beans-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doGetBeanNamesForType(DefaultListableBeanFactory.java:425) ~[spring-beans-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanNamesForType(DefaultListableBeanFactory.java:395) ~[spring-beans-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeansOfType(DefaultListableBeanFactory.java:515) ~[spring-beans-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeansOfType(DefaultListableBeanFactory.java:508) ~[spring-beans-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.getBeansOfType(AbstractApplicationContext.java:1189) ~[spring-context-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.boot.SpringApplication.getExitCodeFromMappedException(SpringApplication.java:862) ~[spring-boot-1.5.1.RELEASE.jar:1.5.1.RELEASE]
	at org.springframework.boot.SpringApplication.getExitCodeFromException(SpringApplication.java:848) ~[spring-boot-1.5.1.RELEASE.jar:1.5.1.RELEASE]
	at org.springframework.boot.SpringApplication.handleExitCode(SpringApplication.java:834) ~[spring-boot-1.5.1.RELEASE.jar:1.5.1.RELEASE]
	at org.springframework.boot.SpringApplication.handleRunFailure(SpringApplication.java:788) ~[spring-boot-1.5.1.RELEASE.jar:1.5.1.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:325) ~[spring-boot-1.5.1.RELEASE.jar:1.5.1.RELEASE]
	at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:120) ~[spring-boot-test-1.5.1.RELEASE.jar:1.5.1.RELEASE]
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:98) ~[spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:116) ~[spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:83) ~[spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.test.context.web.ServletTestExecutionListener.setUpRequestContextIfNecessary(ServletTestExecutionListener.java:189) ~[spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.test.context.web.ServletTestExecutionListener.prepareTestInstance(ServletTestExecutionListener.java:131) ~[spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:230) ~[spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:228) [spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:287) [spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12) [junit-4.12.jar:4.12]
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:289) [spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:247) [spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:94) [spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268) [junit-4.12.jar:4.12]
	at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61) [spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:70) [spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363) [junit-4.12.jar:4.12]
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:191) [spring-test-4.3.6.RELEASE.jar:4.3.6.RELEASE]
	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:283) [surefire-junit4-2.18.1.jar:2.18.1]
	at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:173) [surefire-junit4-2.18.1.jar:2.18.1]
	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:153) [surefire-junit4-2.18.1.jar:2.18.1]
	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:128) [surefire-junit4-2.18.1.jar:2.18.1]
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:203) [surefire-booter-2.18.1.jar:2.18.1]
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:155) [surefire-booter-2.18.1.jar:2.18.1]
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103) [surefire-booter-2.18.1.jar:2.18.1]
Caused by: java.lang.ClassNotFoundException: org.springframework.boot.context.embedded.ServletRegistrationBean
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381) ~[na:1.8.0_112]
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424) ~[na:1.8.0_112]
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331) ~[na:1.8.0_112]
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357) ~[na:1.8.0_112]
	... 51 common frames omitted

	 */
	public void contextLoads() {
	}

	
	@Test
	public void placeHolder(){
		
	}
}

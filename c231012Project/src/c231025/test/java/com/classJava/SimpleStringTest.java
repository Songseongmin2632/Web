package c231025.test.java.com.classJava;

import org.junit.Test;

import c231025.main.java.com.classJava.proxyEx.SimpleStringImpl;
import c231025.main.java.com.classJava.proxyEx.SimpleStringUpper;
import c231025.main.java.com.classJava.proxyEx.ToUpperCaseHandler;
import c231025.main.java.com.classJava.proxyEx.SimpleString;


import static org.junit.Assert.assertThat;

import java.lang.reflect.Proxy;

import static org.hamcrest.CoreMatchers.is;

public class SimpleStringTest {
   @Test
   public void DecoTest() {
      SimpleString simpleStringImpl = new SimpleStringImpl();
      SimpleString simpleString = new SimpleStringUpper();
      ((SimpleStringUpper) simpleString).setSimpleString(simpleStringImpl);
      assertThat(simpleString.hello("한상윤"), is("HELLO 한상윤"));
      assertThat(simpleString.intro("한상윤"), is("MY NAME IS 한상윤"));
      assertThat(simpleString.bye("한상윤"), is("BYE 한상윤"));
   }
   
   @Test
   public void handlerTest() {
	   SimpleString ssProxied = (SimpleString) Proxy.newProxyInstance(
			   getClass().getClassLoader(),
			   new Class[] {SimpleString.class},
			   new ToUpperCaseHandler(new SimpleStringImpl()));
	   assertThat(ssProxied.hello("한상윤"), is("HELLO 한상윤"));
	   assertThat(ssProxied.intro("한상윤"), is("MY NAME IS 한상윤"));
	   assertThat(ssProxied.bye("한상윤"), is("BYE 한상윤"));
   }
}
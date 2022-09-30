package org.tcs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	@BeforeClass
public static void yum() {
 System.out.println("go");

}
@AfterClass
public static void rem() {
System.out.println("url");
}

@Before
public void sys() {
System.out.println("start");
}

@After
public void am() {
System.out.println("using");
}


@Test
public void ecl() {
	System.out.println("mark1");
}
@Test
public void ec2() {
	System.out.println("mark1");
}
@Test
public void ec3() {
	System.out.println("mark1");
}
	
}	
	
	
	
	
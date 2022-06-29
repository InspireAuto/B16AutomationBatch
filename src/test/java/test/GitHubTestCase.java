package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class GitHubTestCase extends TestBase {

	@BeforeClass
	public void launch() {
		browserLaunch();

	}

	@Test
	public void loginTestCase1() {
		System.out.println("First test case");
	}

	@Test
	public void loginTestCase2() {
		System.out.println("Second test case");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}

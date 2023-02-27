import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDemo {

	public static void main(String[] args)  throws MalformedURLException {
		// TODO Auto-generated method stub
        File f = new File("src");
		File Fs = new File(f,"API Demos for Android_1.9.0_Apkpure.apk");
		DesiredCapabilities de = new DesiredCapabilities();
		de.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 5 API 30");
		de.setCapability(MobileCapabilityType.APP, Fs.getAbsolutePath());
		de.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	//	File app;
	//	capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),de);
		
	}
}

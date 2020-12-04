package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.util.Date;

public class Utility extends BaseSetup {
    public void screenshotClick(){
        Date currentdate= new Date();
        String screenshotfilename=currentdate.toString().replace(" ","-").replace(":","-");
        File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File(".//screenshots//"+screenshotfilename+".jpg"));
    }
}

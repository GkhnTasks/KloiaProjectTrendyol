package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrowserUtilities {

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  static void printToTxt(List<String> info, String fileName) {

        File file = new File(fileName +".txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            //instead you could only use:
            fw.write(info.toString());
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static String readTxt(String file)  {
        //Create File In D: Driver.
        String TestFile = "FooterMainLink.txt";
        String content="";
        //Reading from file.
        //Create Object of java FileReader and BufferedReader class.
        FileReader FR = null;
        try {
            FR = new FileReader(TestFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader BR = new BufferedReader(FR);
        try {
            content = BR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }



    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }


}

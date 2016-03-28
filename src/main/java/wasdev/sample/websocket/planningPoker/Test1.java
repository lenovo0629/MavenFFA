package wasdev.sample.websocket.planningPoker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Test1 {
	public Test1() throws IOException {
		String templatePath = "Sample_v0.6.xls";
		InputStream input = new FileInputStream(templatePath);
		HSSFWorkbook wb = new HSSFWorkbook(input);
	}

}
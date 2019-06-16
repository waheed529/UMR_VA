package come.test.files;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class FileTransferTest {

	public static void createInputFile() throws Exception{
		String filepath="C:/Users/john/Documents/docs/"+"Files";
		File f=new File(filepath);
		if(!f.exists()){
			f.mkdir();
		}
		File f2=new File(f.getPath()+"/"+"waheed.txt");
		OutputStream os=new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		}; 
		for(int i=0;i<=10;i++){
			Long no=Long.valueOf(String.valueOf(i));
			os.write(i);
			
		}
	}
	
	public static void main(String arg[])throws Exception{
		createInputFile();
	}
}

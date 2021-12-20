package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import dto.StudentDto;
import single.Singleton;

public class FileProc {

	private File file;
	
	
	public FileProc(String filename) {
		this.file = new File("C:\\myfile\\" + filename + ".txt");
	}

	public void CreateFile() {
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Load() { // 1001-홍길동-171.1-90-85
		Singleton s = Singleton.getInstance();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			
			while((str = br.readLine()) != null){
				String split[] = str.split("-");
				StudentDto dto = new StudentDto();
				for (int i = 0; i < split.length; i++) {
					dto.setNumber(Integer.parseInt(split[0]));
					dto.setName(split[1]);
					dto.setHeight(Double.parseDouble(split[2]));
					dto.setEng(Integer.parseInt(split[3]));
					dto.setMath(Integer.parseInt(split[4]));
				}
				
				s.list.add(dto);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Write() {
		Singleton s = Singleton.getInstance();
		
		PrintWriter pw;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for (int i = 0; i < s.list.size(); i++) {
				StudentDto dto = s.list.get(i);
				pw.println(dto.toString());
			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

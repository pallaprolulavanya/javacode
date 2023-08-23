import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*public class FileOps1 {

	public static void main(String[] args) throws IOException{
		String path1 = "E:\\FilePrograms\\Input.txt";
		String path2 = "E:\\FilePrograms\\Output.txt";
		
		FileInputStream fis = new FileInputStream(path1);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);
		while ((temp=fis.read())!=-1) {
			fos.write(temp);
		}
		fos.close();
		fis.close();
	}

}
*/

/*public class FileOps1 {

	public static void main(String[] args) throws IOException{
		String path1 = "E:\\FilePrograms\\Input2.txt";
		String path2 = "E:\\FilePrograms\\Output2.txt";
		FileReader fr = new FileReader(path1);
		int temp;
		FileWriter fw = new FileWriter(path2);
		while ((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		fw.flush();
		fr.close();
		fw.close();
	}
}
*/


/*public class FileOps1 {

	public static void main(String[] args) throws IOException{
		String path1 = "E:\\FilePrograms\\Input3.txt";
		String path2 = "E:\\FilePrograms\\Output3.txt";
		
		FileReader fr = new FileReader(path1);
		BufferedReader br = new BufferedReader(fr);
		int temp;
		FileWriter fw = new FileWriter(path2);
		BufferedWriter bw = new BufferedWriter(fw);
		while ((temp=br.read())!=-1) {
			bw.write(temp);
		}
		bw.flush();
		fw.flush();
		fr.close();
		fw.close();
	}
}*/

public class FileOps1 {

	public static void main(String[] args) throws IOException{
		String path1 = "E:\\FilePrograms\\Input4.txt";
		String path2 = "E:\\FilePrograms\\Output4.txt";
		
		FileInputStream fis = new FileInputStream(path1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		while ((temp=bis.read())!=-1) {
			bos.write(temp);
		}
		bos.flush();
		bos.close();
		fos.close();
		fis.close();
	}
}


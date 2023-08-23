import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class customer implements Serializable{
	int custid;
	String name;
	int accno;
	String pwd;
	int balance;
	public customer(int custid,
	String name,
	int accno,
	String pwd,
	int balance) {
		super();
		this.custid=custid;
		this.name=name;
		this.accno=accno;
		this.pwd=pwd;
		this.balance=balance;
	}
	void display() {
		System.out.println(custid);
		System.out.println(name);
		System.out.println(accno);
		System.out.println(pwd);
		System.out.println(balance);
	}
}
public class serialization {

	public static void main(String[] args) throws IOException {
		customer c=new customer(1,"Lav",118,"Reddy143",70000);
		c.display();
		String path="E:\\FilePrograms\\customer.txt";
		FileOutputStream fos =new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
	}

}

import java.util.*; 
import java.util.Scanner;
import java.util.Iterator;
import java.util.Scanner;

public class Peri {

	private int code;
	 private String name;
	 private String peripheral;
	 
Peri	 (int code, String name,String peripheral){
		 this.code = code;
		 this.name = name;
		 this.peripheral = peripheral;
	 }
	 public int getCode() {
		 return code;
	 }
	 public String getName() {
		 return name;
	 }
	 public String getPeripheral() {
		 return peripheral;
	}
	 public String toString() {
		 return code +" "+ name +" "+ peripheral;
	 }
}

	class Crudmethod{
		public static void main(String[] args) {
			
			List<Peri> Peris= new ArrayList<Peri>();
			Iterator<Peri> re=Peris.iterator();
			Scanner s = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			int b;
			do {
				System.out.println("1.Insert Peripheral Information");
				System.out.println("2.Display Information");
				System.out.println("3.Search Records");
				System.out.println("4.Delete Records");
				System.out.println("5.Update the Records");
				System.out.print("Please enter Your Choice : ");
				b = s.nextInt();
				
				switch(b) {
					case 1:
						System.out.println("Please Enter Code : ");
						int code = s.nextInt();
						System.out.println("Please Enter Name : ");
						String name = s.next();
						System.out.println("Please Enter Peripheral : ");
						String peripheral = s.next();
						
						Peris.add(new Peri(code,name,peripheral));
					break;
					case 2:
						System.out.println("-------------------------------");
						 re = Peris.iterator();
						while(re.hasNext()) {
							Peri r = re.next();
							System.out.println(r);
						}
						System.out.println("-------------------------------");
					break;
					case 3:
						
						boolean found = false;
						System.out.print("Please The Enter Code to Search : ");
						code = s.nextInt();
						System.out.println("-------------------------------");
						re = Peris.iterator();
						while(re.hasNext()) {
							Peri r = re.next();
							if(r.getCode() == code) {
								System.out.println(r);
								found = true;
						}
					}
						
						if(!found) {
							System.out.println("Im sorry but thr Record Not Found");
						}
						System.out.println("-------------------------------");
					break;
					
					case 4:
						found = false;
						System.out.print("Please Enter the Code to Delete : ");
						code = s.nextInt();
						re = Peris.iterator();
						while(re.hasNext()) {
							Peri r = re.next();
							if(r.getCode() == code) {
								re.remove();
								found = true;
							}
						}
						
						if(!found) {
							System.out.println("Im sorry but the Record Not Found");
						}else{ 
							System.out.println("Im sorry but the Record is Delete Succesfully...!");
						}
						
						System.out.println("-------------------------------");
					break;
					case 5:
						found = false;
						System.out.print("Please Enter Code to Update : ");
						code = s.nextInt();
						System.out.println("-------------------------------");
						ListIterator<Peri>li = Peris.listIterator();
						while(li.hasNext()) {
							Peri r = li.next();
							if(r.getCode() == code) {
								System.out.println("Please Enter new Name : ");
								name = sc.nextLine();
								
								System.out.println("Pleasr Enter new Peripheral : ");
								peripheral = s.nextLine();
								li.set(new Peri(code,name,peripheral));
								found = true;
							}
						}
						
						if(!found) {
							System.out.println("Im Sorry But the Record Is Not Found");
						}else {
							System.out.println(" Congrats The Record is Successfully Updated");
						}
						
						System.out.println("-------------------------------");
					break;
						
					
				}
			}while(b!=0);
			
				
			}
		}
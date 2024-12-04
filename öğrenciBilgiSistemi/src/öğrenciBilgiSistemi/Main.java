package öğrenciBilgiSistemi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StudentManagementSystem sms = new StudentManagementSystem();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Öğrenci ekle");
			System.out.println("2. Öğrenci Listele");
			System.out.println("3. Öğrenci Güncelle");
			System.out.println("4. Öğrenci Sil");
			System.out.println("5. Çıkış Yap");
			System.out.print("Seçiminiz :");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			boolean isExit = false;
			
			switch(choice) {
				case 1:
					System.out.print("Öğrenci Adı: ");
					String name = scanner.nextLine();
					System.out.print("Öğrenci Mail: ");
					String mail = scanner.nextLine();
					sms.addStudent(name, mail);
					break;
				case 2:
					sms.listStudents();
					break;
				case 3:
					System.out.print("Güncellenecek Öğrenci ID: ");
					int updateId = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Yeni Ad: ");
					String newName = scanner.nextLine();
					System.out.print("Yeni Email: ");
					String newEmail = scanner.nextLine();
					sms.updateStudent(updateId, newName, newEmail);
					break;
				case 4:
					System.out.print("Silinecek Öğrenci ID: ");
					int deleteId = scanner.nextInt();
					sms.deleteStudent(deleteId);
					break;
				case 5:
					System.out.println("Çıkış yapılıyor... ");
					isExit = true;
					break;
				default:
					System.out.println("Geçersiz seçim, Lütfen tekrar deneyiniz !");
			}
			
			if(isExit) {
				break;
			}
		}

	}

}

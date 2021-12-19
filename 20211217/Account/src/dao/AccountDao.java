package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import dto.AccountDto;

public class AccountDao {
	Scanner sc = new Scanner(System.in);
	private ArrayList<AccountDto> dto; 
	
	public AccountDao() {
		
		this.dto = new ArrayList<AccountDto>();
		try {
			File file = new File("c:\\myfile\\Account.txt");	
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;			
			while((line = br.readLine()) != null) {
				String split[] = line.split("-");
				this.dto.add(new AccountDto(split[0], split[1], split[2], Integer.parseInt(split[3]), split[4]));
			}	
		}
		catch (IOException e){
			System.out.println("읽을 파일이 존재하지 않으므로 수동모드로 전환합니다.");
		}
		
	}


	// list <- 불러오기
	
	// Create
	public void create() {
		dto.add(inputFormat());
	}
	public AccountDto inputFormat() {
		System.out.print("날짜를 기입하세요 (YYYY/MM/DD) : ");
		String dateTime = sc.next();
		
		System.out.print("용도를 기입하세요 (간략하게) : ");
		String use = sc.next();			// 용도(분류)
		
		System.out.print("수입/지출를 기입하세요 (수입/지출) : ");
		String classify = sc.next();	// 수입/지출
		
		System.out.print("금액 기입하세요 (숫자만) : ");
		int money = sc.nextInt();				// 금액
		
		System.out.print("자세한 내용, 메모를 기입하세요 : ");
		String memo = sc.next();		// 내용
		
		System.out.println("추가가 완료되었습니다.");
		return new AccountDto(dateTime, use, classify, money, memo);
	}
	
	private int getCase() {
		System.out.println("1. 날짜");
		System.out.println("2. 용도");
		System.out.println("3. 수입/지출");
		System.out.println("4. 금액");
		System.out.println("5. 자세한 내용(메모)");
		System.out.println("6. 지정한 달");
		int flag = sc.nextInt();
		return flag;
	}
	// Read
	public ArrayList<Integer> read() {
		System.out.println("검색하고 싶은 목차를 선택하세요 : ");
		ArrayList<Integer> result = new ArrayList<Integer>(); 
		int flag = getCase();
		switch(flag) {
			case 1:
				readByDate(result);
				break;
			case 2:
				readByUse(result);
				break;
			case 3:
				readByClassify(result);
				break;
			case 4:
				readByMoney(result);
				break;
			case 5:
				readByMemo(result);
				break;
			case 6:
				readByMonth(result);
				printSum(result);
				break;
			default:
				System.out.println("잘못된 숫자를 입력했습니다. 처음부터 다시 해주세요.");
		}	
		printresult(result);
		return result;
	}

	private void printSum(ArrayList<Integer> result) {
		int in = 0;
		int out = 0;
		for (Integer integer : result) {
			if (dto.get(integer).getClassify().equals("수입")) {
				in += dto.get(integer).getMoney();
			}
			else {
				out += dto.get(integer).getMoney();
			}
		}
		System.out.println("총 수입 : " + in + "원 / 총 지출 : " + out + "원");
	}


	private void readByMonth(ArrayList<Integer> result) {
		System.out.print("검색하고 싶은 월을 기입하세요 (1~12) : ");
		String month = sc.next();
		if (month.length() == 1) {
			month = "0"+month;
		}
		for (int i = 0; i<dto.size(); i++) {
			if (dto.get(i).getDateTime().split("/")[1].equals(month)) {
				result.add(i);
			}
		}
	}


	private void printresult(ArrayList<Integer> result) {
		int i = 1;
		for (Integer integer : result) {
			System.out.println(i + "번: " + dto.get(integer).toString());
			i++;
		}
	}


	private void readByDate(ArrayList<Integer> result) {
		System.out.print("검색하고 싶은 날짜를 기입하세요 (YYYY/MM/DD) : ");
		String dateTime = sc.next();			// 용도(분류)
		for (int i = 0; i<dto.size(); i++) {
			if (dto.get(i).getDateTime().equals(dateTime)) {
				result.add(i);
			}
		}
	}
	
	private void readByUse(ArrayList<Integer> result) {
		System.out.print("검색하고 싶은 간략한 용도를 기입하세요 : ");
		String use = sc.next();			// 용도(분류)
		for (int i = 0; i<dto.size(); i++) {
			if (dto.get(i).getUse().equals(use)) {
				result.add(i);
			}
		}
	}
	
	private void readByClassify(ArrayList<Integer> result) {
		System.out.print("수입/지출를 기입하세요 (수입/지출) : ");
		String classify = sc.next();			// 용도(분류)
		if (classify.equals("수입") || classify.equals("지출")) {
			for (int i = 0; i<dto.size(); i++) {
				if (dto.get(i).getClassify().equals(classify)) {
					result.add(i);
				}
			}
		}
	}
	
	private void readByMoney(ArrayList<Integer> result) {
		System.out.print("검색하고 싶은 금액을 기입하세요 (숫자만) : ");
		int money = sc.nextInt();
		for (int i = 0; i < dto.size(); i++) {
			if (dto.get(i).getMoney() == money) {
				result.add(i);
			}
		}
	}
	
	private void readByMemo(ArrayList<Integer> result) {
		System.out.print("검색하고 싶은 금액을 기입하세요 (숫자만) : ");
		String memo = sc.next();
		for (int i = 0; i < dto.size(); i++) {
			if (dto.get(i).getMemo() == memo) {
				result.add(i);
			}
		}
	}
	
	// Update
	public AccountDto update() {
		System.out.println("갱신하고 싶은 데이터를 검색하겠습니다.");
		ArrayList<Integer> result = read();
		System.out.print("갱신하고 싶은 데이터의 번호를 선택하세요 : ");
		int index = sc.nextInt()-1;
		int updateAccount = result.get(index);
		System.out.print("갱신할 날짜를 기입하세요 (YYYY/MM/DD) : ");
		String dateTime = sc.next();
		dto.get(updateAccount).setDateTime(dateTime);
		
		System.out.print("갱신할 용도를 기입하세요 (간략하게) : ");
		String use = sc.next();			// 용도(분류)
		dto.get(updateAccount).setUse(use);
		
		System.out.print("갱신할 수입/지출를 기입하세요 (수입/지출) : ");
		String classify = sc.next();	// 수입/지출
		dto.get(updateAccount).setClassify(classify);
		
		System.out.print("갱신할 금액 기입하세요 (숫자만) : ");
		int money = sc.nextInt();				// 금액
		dto.get(updateAccount).setMoney(money);
		
		System.out.print("갱신할 자세한 내용, 메모를 기입하세요 : ");
		String memo = sc.next();		// 내용
		dto.get(updateAccount).setMemo(memo);
		
		System.out.println("수정이 완료되었습니다.");
		return dto.get(updateAccount);
		
	}
	
	// Delete
	public AccountDto delete() {
		System.out.println("삭제하고 싶은 데이터를 검색하겠습니다.");
		ArrayList<Integer> result = read();
		System.out.print("삭제하고 싶은 데이터의 번호를 선택하세요 : ");
		int index = sc.nextInt()-1;
		System.out.println("수정이 완료되었습니다.");
		int removeIndex = result.get(index);
		return dto.remove(removeIndex);		
	}
	
	// all data print
	public void alldata() {
		for (AccountDto accountDto : dto) {
			System.out.println(accountDto.toString());
		}
	}

	public void fileWrite() {
		File file = new File("c:\\myfile\\");
		try {
			file.mkdir();
			file = new File("c:\\myfile\\Account.txt");
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			for (int i = 0; i < dto.size(); i++) {
				AccountDto line = dto.get(i);
				pw.println(line.getDateTime()+"-"+line.getUse()+"-"+line.getClassify()+"-"+line.getMoney()+"-"+line.getMemo());
			}
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	@Override
//	public String toString() {
//		return "AccountDao [dto=" + dto + "]";
//	}
	
	// select
	// 입력한 달의 데이터 모두 출력 -> 총 수입과 총 지출
	// 내용(memo) 검색어로 산출된 데이터만을 출력
	
	// ---------------------------------------
	
	// 파일 저장(메뉴) / 불러오기
}

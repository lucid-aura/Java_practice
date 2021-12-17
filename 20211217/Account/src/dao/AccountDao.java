package dao;

import java.util.ArrayList;
import java.util.Scanner;

import dto.AccountDto;

public class AccountDao {
	Scanner sc = new Scanner(System.in);
	private ArrayList<AccountDto> dto;
	
	public AccountDao() {
		this.dto = new ArrayList<AccountDto>();
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
	
	// Read
	public void read() {
		System.out.print("검색하고 싶은 목차를 선택하세요 : ");
		System.out.println("1. 날짜");
		System.out.println("2. 용도");
		System.out.println("3. 수입/지출");
		System.out.println("4. 금액");
		System.out.println("5. 자세한 내용(메모)");
		System.out.println("6. 뒤로가기");
		ArrayList<AccountDto> result = new ArrayList<AccountDto>(); 
		int flag = sc.nextInt();
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
		}	
		printresult(result);
	}

	private void printresult(ArrayList<AccountDto> result) {
		for (AccountDto accountDto : result) {
			System.out.println(accountDto.toString());
		}
	}


	private void readByDate(ArrayList<AccountDto> result) {
		System.out.print("검색하고 싶은 날짜를 기입하세요 (YYYY/MM/DD) : ");
		String dateTime = sc.next();			// 용도(분류)
		for (AccountDto accountDto : dto) {
			if (accountDto.getDateTime().equals(dateTime)) {
				result.add(accountDto);
			}
		}
	}
	
	private void readByUse(ArrayList<AccountDto> result) {
		System.out.print("검색하고 싶은 간략한 용도를 기입하세요 : ");
		String use = sc.next();			// 용도(분류)
		for (AccountDto accountDto : dto) {
			if (accountDto.getUse().contains(use)) {
				result.add(accountDto);
			}
		}
	}
	
	private void readByClassify(ArrayList<AccountDto> result) {
		System.out.print("수입/지출를 기입하세요 (수입/지출) : ");
		String classify = sc.next();			// 용도(분류)
		if (classify.equals("수입") || classify.equals("지출")) {
			for (AccountDto accountDto : dto) {
				if (accountDto.getClassify().equals(classify)) {
					result.add(accountDto);
				}
			}
		}
	}
	
	private void readByMoney(ArrayList<AccountDto> result) {
		System.out.print("검색하고 싶은 금액을 기입하세요 (숫자만) : ");
		int money = sc.nextInt();
		for (AccountDto accountDto : dto) {
			if (accountDto.getMoney() == money) {
				result.add(accountDto);
			}
		}
	}
	
	private void readByMemo(ArrayList<AccountDto> result) {
		System.out.print("검색하고 싶은 금액을 기입하세요 (숫자만) : ");
		String memo = sc.next();
		for (AccountDto accountDto : dto) {
			if (accountDto.getMemo().contains(memo)) {
				result.add(accountDto);
			}
		}
	}
	// CRUD
	
	// Update
	
	// all data print
	public void alldata() {
		for (AccountDto accountDto : dto) {
			System.out.println(accountDto.toString());
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

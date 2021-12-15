package question3;

public class MovieWork extends Movie{
	private int creativity;
	private int popularity;
	private int script;
	
	public MovieWork(String title, int director, int acter, int creativity,  int popularity, int script) {
		super(title, director, acter);
		this.creativity = creativity;
		this.popularity = popularity;
		this.script = script;
	}

	@Override 
	public void display() { //여기를 구현하세요. 
		int total = director + acter + creativity + popularity + script;
		String result = "";
		
		System.out.printf("영화제목:%s\n", title);
		System.out.printf("감독:%d, 배우:%d, 작품성:%d, 대중성:%d, 대본:%d\n", director, acter, creativity, popularity, script);
		System.out.printf("영화총점 :%d\n", total);

		if (total >= 15)
			result = "☆☆☆☆☆";
		else if (total >= 12)
			result = "☆☆☆☆";
		else if (total >= 10)
			result = "☆☆☆";
		else
			result = "☆☆";
		
		System.out.println("영화평점 : " + result);
	}
}

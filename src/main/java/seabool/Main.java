package seabool;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public int countWords(String words){
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}

	public static void main(String[] args){
		Main main = new Main();
		String text = "Hey hello hi yo";
		System.out.print(text);
		System.out.print("Number of words: " + Integer.toString(main.countWords(text)));
	}

}
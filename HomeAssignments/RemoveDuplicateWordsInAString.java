package home_assignments;

public class RemoveDuplicateWordsInAString {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		
		String[] words = text.split(" ");
		String[] modifiedWords = new String[words.length];
		
		int count=0;
		for(int i=0;i<words.length;i++) {
			for(int j=1;j<words.length;j++) {
				if(words[i]==words[j]) {
					words[j]=" ";
					count = count+1;
				}
			}
		}
		System.out.println(count);

	}

}

package interfaceExamples;

public abstract class Human implements SocialBehavior {
	@Override
	public boolean politeCommunication(String[] words) {
		for (String word: words) {
			for (String restricted: SocialBehavior.restrictedWordCategories) {
				if (word.equals(restricted)) {
					return false;
				}
			}
		}
		
		return true;
	}
}

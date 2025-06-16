package interfaceExamples;

public interface SocialBehavior {
	String[] restrictedWordCategories = {"jargons", "curse"};
	public abstract boolean politeCommunication(String[] words);
}

public class IndexOfElements {
	
	public static int indexOfFirstOccurrence(String[] stringArray, String target) {
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(target)) {
				return i;
			}
		}

		// the string is not present in the list, therefore return -1
		return -1;
	}

	public static void main(String[] args) {
		String[] list = {"string1", "string2", "string3"};
		
		System.out.println(indexOfFirstOccurrence(list, "string3"));
		System.out.println(indexOfFirstOccurrence(list, "string4"));
	}
}
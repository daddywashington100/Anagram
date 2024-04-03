public class anagram {

    public class Main {
        private static final int EXTENDED_ASCII_CODES = 256;

        public static boolean  isAnagram(String str1, String str2){

            // storing each word in an array to compare length as first anagram test
            int[] chCounts = new int[EXTENDED_ASCII_CODES];
            char[] chStr1 = str1.replaceAll("\\s","").toLowerCase().toCharArray();
            char[] chStr2 = str2.replaceAll("\\s","").toLowerCase().toCharArray();

            if(chStr1.length != chStr2.length){
                return false;
            }
            //testing changes
            for (int i= 0; i < chStr1.length; i++){
                chCounts[chStr2[i]]++;
                chCounts[chStr1[i]]--;
            }
            for (int i=0; i < chCounts.length; i++) {
                if (chCounts[i] !=0){
                    return false;
                }
            }

            return true;
        }
    }

}

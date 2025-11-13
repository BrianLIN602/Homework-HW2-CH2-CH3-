public class Sample2_22 {
    public static void main(String[] args) {

        // scores[科目][人]
        int[][] scores = {
            {80, 60, 22, 50, 75}, // 國語
            {90, 55, 68, 72, 58}  // 數學
        };

        String[] subjects = {"國語", "數學"};

        for (int i = 0; i < scores[0].length; i++) 
        {
            for (int j = 0; j < subjects.length; j++) 
            {
                System.out.println("第" + (i + 1) + "個人的" + subjects[j] + "分數是" + scores[j][i] + "分");
            }
        }
    }
}

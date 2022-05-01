public class SkillDemo{
    static int  Max(int[] ListOfNums){
        int maxVal = ListOfNums[0];
        for(int i=0; i < ListOfNums.length; i+=1){
            if(ListOfNums[i] > maxVal){
                maxVal= ListOfNums[i];
            }
        }
        return maxVal;
    }
 

}

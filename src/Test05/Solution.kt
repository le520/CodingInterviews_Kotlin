package Test05

/**
 * @author noorall
 * @date 2021/3/20 3:01 下午
 * @Description:
 */
class Solution {
    fun replaceSpace(s: String): String {
        var str=StringBuilder()
        for(char in s){
            if(char == ' '){
                str.append("%20")
            }else{
                str.append(char)
            }
        }
        return str.toString()
    }
}
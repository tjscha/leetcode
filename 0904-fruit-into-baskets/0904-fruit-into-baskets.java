import java.util.Stack;

class Solution {
    public int totalFruit(int[] fruits) {
        int count = 0;
        int size = fruits.length;
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        int index = 0;
        int fincount = 0;
        boolean picking = true;
        boolean doubled = false;
        
        while(picking){
            count = 0;
            for(int i = index; i<size; i++){
                if(first.empty()){
                    first.push(fruits[i]);
                    count++;
                }else if(first.peek() == fruits[i]){
                    count++;
                    if(doubled == false)
                        index++;
                }else if(second.empty()){
                    second.push(fruits[i]);
                    count++;
                    doubled = true;
                }else if(second.peek() == fruits[i]){
                    count++;
                }else{
                    break;
                }
            }
            if(count > fincount){
                fincount = count;
                if(count == size){
                    picking = false;
                }
            }
            first.removeAllElements();
            second.removeAllElements();
            index++;
            doubled = false;
            if(index >= size){
                picking = false;
            }
            
        }
        
        return fincount;

    }
}
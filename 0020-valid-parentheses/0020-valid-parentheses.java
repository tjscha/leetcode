class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new  Stack<>();
        Stack<Character> hold = new Stack<>();
        
        if(s.length()%2 != 0){
            return false;
        }
        
        for(int i = 0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }
        while(!stack.empty()){
            if(stack.peek() == ')' || stack.peek() == '}' || stack.peek() == ']'){
                hold.push(stack.pop());
            }else if(hold.isEmpty()){
                return false;
            }else{

                if(hold.peek() == ')'){

                    if(stack.peek() !='('){
                        return false;
                    }else{
                        stack.pop();
                        hold.pop();
                    }
                }else if(hold.peek() == '}'){
                    if(stack.peek() != '{'){
                        return false;
                    }else{
                        stack.pop();
                        hold.pop();
                    }
                }else if(hold.peek() == ']'){
                    if(stack.peek() != '['){
                        return false;
                    }else{
                        stack.pop();
                        hold.pop();
                    }
                }
            }

            
        }
        
        if(hold.isEmpty() && stack.isEmpty()){
        
            return true;
        }else{
            return false;
        }

    }
}
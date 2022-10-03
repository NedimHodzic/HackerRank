/*
Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can. Return the final string after all such duplicate removals have been made. 
It is guaranteed the answer is unique.

Input: "abbaca" Output: "ca"
*/

    public static String DuplicateLetterRemoval(String input_str) {
        Stack<Character> letterStack = new Stack<>();
        letterStack.push(input_str.charAt(0));
        for(int i = 1; i < input_str.length(); i++) {
            if(!letterStack.isEmpty()) {
                if(input_str.charAt(i) == letterStack.peek()) {
                    letterStack.pop();
                }
                else {
                    letterStack.push(input_str.charAt(i));
                }
            }
            else {
                letterStack.push(input_str.charAt(i));
            }
            
        }
        
        String answer = "";
        while(!letterStack.isEmpty()) {
            answer += letterStack.pop();
        }
        String revAnswer = "";
        for(int i = answer.length() - 1; i >= 0; i--) {
            revAnswer += answer.charAt(i);
        }
        
        return revAnswer;
    }
